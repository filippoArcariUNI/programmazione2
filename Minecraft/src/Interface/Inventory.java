package Interface;

import Data.Blocks.BlockExteptions.BlockErrorException;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Blocks.NullBlock;
import Data.Order.AlphabeticOrder;

import java.util.ArrayList;
import java.util.Comparator;

public class Inventory {
    private ArrayList<Block> inventario = new ArrayList<>();

    public void add_block(Block b){
        this.inventario.add(b);
        this.inventario.sort(new AlphabeticOrder());
    }
    private boolean is_smeltable(int index) throws BlockErrorException{
        if (index < inventario.size()){
            return inventario.get(index) instanceof SmeltableBlocks;
        }else{
            throw new BlockErrorException();
        }

    }
    public  Block get_smeltable_item(int index) throws BlockErrorException{
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

    public void  removeItem(int itemIndex){
        inventario.remove(itemIndex);
        this.inventario.sort(new AlphabeticOrder());
    }
}
