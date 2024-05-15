package GUI.Controller;

import Data.Blocks.Interfaces.Block;
import GUI.BlockPane;
import GUI.InventoryPane;
import Interface.Inventory;

import java.util.ArrayList;
import java.util.Iterator;

public class InventorySimpleController implements SimpleController {
    Inventory i;
    InventoryPane ip;

    public InventorySimpleController(Inventory myInventory){
        i=myInventory;
        ip = new InventoryPane(new ArrayList<Block>());
    }
    @Override
    public void redraw() {
        ArrayList<Block> inventory = new ArrayList<>();
        Iterator<Block> iterator = i.blockIterator() ;
        while (iterator.hasNext()){
            ip.getChildren().add(new BlockPane(iterator.next()));
        }
    }

}
