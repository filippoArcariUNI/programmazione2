package GUI.Controller;

import Data.Blocks.Interfaces.Block;
import GUI.Model.Inventory;
import GUI.Visual.BlockPane;
import GUI.Visual.InventoryPane;

import java.util.ArrayList;
import java.util.Iterator;

public class InventorySimpleController implements SimpleController {
    Inventory i;
    InventoryPane ip;

    public InventorySimpleController(Inventory myInventory,InventoryPane inventoryPane){
        i=myInventory;
        ip = inventoryPane;
    }
    @Override
    public void redraw() {
        ip.getChildren().clear();
        ArrayList<Block> inventory = new ArrayList<>();
        Iterator<Block> iterator = i.blockIterator() ;
        int  i =0 ;
        while (iterator.hasNext()){
            ip.getChildren().add(new BlockPane(iterator.next(),i));
            i++;
        }
    }

}
