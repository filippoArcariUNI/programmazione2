package GUI.Model;

import Data.BlockFactory;
import Data.Blocks.AirBlock;
import Data.Blocks.BlockExteptions.BlockErrorException;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Blocks.NullBlock;
import Data.Exceptions.WrongCoordinatesException;
import Data.Location;
import Data.Order.AlphabeticOrder;
import Data.Order.BlockComparator;
import GUI.Printer.FurnacePrinter;
import GUI.Printer.InventoryPrinter;
import GUI.Printer.MainPrinter;
import GUI.Printer.MapPrinter;
import GUI.Visual.BlockPane;

public class MainView {
    private Map myMap;
    private Furnace myFurnace;
    private Inventory myInventory;
    private MainPrinter mainPrinter;
    private MapPrinter mapPrinter;
    private FurnacePrinter furnacePrinter;
    private InventoryPrinter inventoryPrinter;

    public void update(){
        mainPrinter.update(mapPrinter,furnacePrinter,inventoryPrinter);
    }

    public void smelt(){
    myFurnace.smelt();
    }

    public Furnace getMyFurnace() {
        return myFurnace;
    }

    public Inventory getMyInventory() {
        return myInventory;
    }

    public Map getMyMap() {
        return myMap;
    }
    public MainView(){
        myMap=new Map();
        myFurnace=new Furnace();
        myInventory=new Inventory();
        mainPrinter = new MainPrinter();
        furnacePrinter= new FurnacePrinter();
        inventoryPrinter = new InventoryPrinter();
        mapPrinter = new MapPrinter();
    }
   public void move_into_furnace_from_inventory(int indexInInventory){
        try {
            SmeltableBlocks b =  myInventory.get_smeltable_item(indexInInventory);
            if (b != null){
                myFurnace.setInput(b);
                myInventory.removeItem(indexInInventory);
            }
        }catch (BlockErrorException e){
            System.out.println(e.toString());
        }

    }
    public void move_into_inventory_from_inpt_furnace(){
        if(!(myFurnace.getInput() instanceof NullBlock)){
            Block t = myFurnace.getInput();
            myInventory.add_block(t);
            myFurnace.setInput(new BlockFactory().null_block());
        }
    }
    public void move_into_inventory_from_out_furnace(){
        if(!(myFurnace.getOut() instanceof NullBlock)){
            Block t = myFurnace.getOut();
            myInventory.add_block(t);
            myFurnace.setOut(new BlockFactory().null_block());
        }
    }

    public void pick_up_block(Location l){
        try {
            Block t= myMap.getBlock(l);
            if(t.isPickable()){
                myInventory.add_block(t);
                myMap.insert_at_coords(l,new AirBlock());
            }
        }catch (WrongCoordinatesException e){
            throw new RuntimeException(e);
        }


    }
    public void toggle_inventory_comparator(boolean selector){
        if (selector){
            myInventory.getInventario().sort(new AlphabeticOrder());
        }else{
            myInventory.getInventario().sort(new BlockComparator());
        }
    }
    public void insertRandomBlock(Location l, Block b){
        try {
            myMap.insert_at_coords(l,b);
        } catch (WrongCoordinatesException e) {
            throw new RuntimeException(e);
        }
    }
    public void mineBlock(Location l,BlockPane bp,Boolean hasPickaxe){

        if (hasPickaxe){
            bp.setDurezza(bp.getDurezza()-2);
        }else{
            bp.setDurezza(bp.getDurezza()-1);
        }
        if (bp.getDurezza()<=0){
            this.pick_up_block(l);
        }
    }
}
