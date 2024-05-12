package Data.Order;

import Data.Blocks.*;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Furnace;

import java.util.Comparator;


public class BlockComparator implements Comparator<Block> {

    @Override
    public int compare(Block b1, Block b2) {
        if(define_number(b1) < define_number(b2)){
            return 1;
        } else if (define_number(b1) == define_number(b2)) {
            return 0;
        }else {
            return -1;
        }
    }
    private int define_number(Block b){
        if(b instanceof AirBlock){
            return  1;
        }else if(b instanceof Furnace){
            return  2;
        } else if (b instanceof  GlassBlock) {
            return 3;
        } else if (b instanceof IronSwordBlock) {
            return 4;
        } else if (b instanceof NullBlock) {
            return 5;
        } else if (b instanceof  RawIronBlock) {
            return 6;
        }else if(b instanceof SandBlock){
            return 7;
        } else if (b instanceof WaterBlock) {
            return 8;
        }
        return 100;
    }
}
