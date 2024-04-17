package Interface;
import Data.Blocks.*;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class MainvView{
    private Map myMap;
    private Furnace myFurnace;

    private Inventroy myInventory;

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
        myMap=new Map();
        myFurnace=new Furnace();
        myInventory=new Inventroy();
    }
    public void move_into_furnace(Location pos){
        int z=pos.isZ();
        int x=pos.isX();

        if (pos.inBounds()){
            if (myMap.isSmeltable(pos)){
                myFurnace.setInput((SmeltableBlocks)myMap.getBlock(new Location(z,x)));
                myFurnace.display_on_out();
                myMap.insert_at_coords(new Location(z,x),new AirBlock());
            }
        }
    }
}
