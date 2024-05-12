package Data.Order;

import Data.Blocks.Interfaces.Block;

import java.util.Comparator;
import java.util.Objects;

public class AlphabeticOrder implements Comparator<Block> {
    @Override
    public int compare(Block b1, Block b2) {
        if (b1.getBlockName().compareTo(b2.getBlockName()) >0){
            return 1;
        }else if(Objects.equals(b1.getBlockName(), b2.getBlockName())){
            return 0;
        }else{
            return -1;
        }
    }
}
