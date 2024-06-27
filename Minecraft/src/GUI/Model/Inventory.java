package GUI.Model;

import Data.Blocks.BlockExteptions.BlockErrorException;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Order.AlphabeticOrder;

import java.util.ArrayList;
import java.util.Collection;

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
    public  SmeltableBlocks get_smeltable_item(int index) throws BlockErrorException{
        if(is_smeltable(index)){
            return (SmeltableBlocks)inventario.get(index);
        }else{
            return null;
        }
    }
    public void  removeItem(int itemIndex){
        inventario.remove(itemIndex);
        this.inventario.sort(new AlphabeticOrder());
    }
    public Collection<Object> blockIterator(){
        return (Collection<Object>) inventario.listIterator();
    }

    public ArrayList<Block> getInventario() {
        return inventario;
    }
    public void setInventario(ArrayList<Block> inventario) {
        this.inventario = inventario;
    }
}
