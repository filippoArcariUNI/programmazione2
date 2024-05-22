package GUI.Printer;

import Data.Blocks.Interfaces.Block;

import java.util.ArrayList;

public class InventoryPrinter implements TextPrinter{
    private ArrayList<Block> inventory;
    public InventoryPrinter(){}
    public void update(ArrayList<Block> inventory){
        this.inventory=inventory;
    }
    @Override
    public void display_on_out(){
        System.out.print("{");
        for(Block e : inventory){
            System.out.print(e.display_in_inventory());
        }
        System.out.print("}");
    }
}
