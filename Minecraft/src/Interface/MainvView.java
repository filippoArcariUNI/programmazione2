package Interface;
import Data.Blocks.*;
import Data.Blocks.BlockExteptions.BlockErrorException;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Interface.Exteptions.WrongCoordinatesException;

public class MainvView{
    private Map myMap;
    private Furnace myFurnace;

    private Inventory myInventory;

    public void displayFurnace(){
        myFurnace.display_on_out();
    }
    public void display_on_out(){
        myMap.display_on_out();
    }

    public void displayInventory() {myInventory.display_on_out();}
    public void smelt(){
        myFurnace.smelt();
        Block b= myFurnace.is_output();
        myInventory.add_block(b);
    }
    public MainvView(){
        try {
            myMap=new Map();
            myFurnace=new Furnace();
            myInventory=new Inventory();
        } catch (WrongCoordinatesException e) {
            throw new RuntimeException(e);
        }
    }
   public void move_into_furnace_from_inventory(int indexInInventory){
        try {
            myFurnace.setInput((SmeltableBlocks)myInventory.get_smeltable_item(indexInInventory));
            myInventory.removeItem(indexInInventory);
        }catch (BlockErrorException e){
            System.out.println(e.toString());
        }

    }
    public void move_into_inventory_from_furnace(){
        if(!(myFurnace.getInput() instanceof NullBlock)){
            Block t = myFurnace.getInput();
            myInventory.add_block(t);
            myFurnace.setInput(new NullBlock());
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
    public void toggle_inventory_comparator(){

    }
}
