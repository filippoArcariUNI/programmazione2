package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class RawIronBlock extends AbstractSolidBlock implements SmeltableBlocks {
    public RawIronBlock(){
        super();
        content ='i';
        blockName="Raw Iron Block";
        durezza = 5 ;
    }

    public Block smelt() {
        return new IronSwordBlock();
    }
}
