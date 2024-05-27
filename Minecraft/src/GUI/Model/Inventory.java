package GUI.Model;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.BlockExteptions.BlockErrorException;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Blocks.NullBlock;
import Data.Order.AlphabeticOrder;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Block> inventario = new ArrayList<>();

    public void add_block(Block b){
        this.inventario.add((AbstractSolidBlock) b);
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
    public void  removeItem(int itemIndex){
        inventario.remove(itemIndex);
        this.inventario.sort(new AlphabeticOrder());
    }
    public Iterator<Block> blockIterator(){
        return inventario.listIterator();
    }

    public ArrayList<Block> getInventario() {
        return inventario;
    }


    public void setInventario(ArrayList<Block> inventario) {
        this.inventario = inventario;
    }
}
