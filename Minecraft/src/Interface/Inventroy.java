package Interface;

import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Blocks.NullBlock;

import java.util.ArrayList;
import java.util.Collection;

public class Inventroy {
    private ArrayList<Block> inventario = new ArrayList<>();

    public void add_block(Block b){
        this.inventario.add(b);
    }
    public boolean is_smeltable(int index){
        return inventario.get(index) instanceof SmeltableBlocks;
    }
    public  Block get_smeltable_item(int index){
        if(is_smeltable(index)){
            return inventario.get(index);
        }else{
            return new NullBlock();
        }
    }
    public void display_on_out(){
        System.out.print("{");
        for(Block e : inventario){
            System.out.print(e.display_in_inventory());
        }
        System.out.print("}");
    }
}
