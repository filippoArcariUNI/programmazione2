package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractBlock;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class RawIronBlock extends AbstractBlock implements SmeltableBlocks {
    public RawIronBlock(){
        super();
        content ='i';
        blockName="Raw Iron Block";
    }

    public Block smelt() {
        return new IronSwordBlock();
    }
}
