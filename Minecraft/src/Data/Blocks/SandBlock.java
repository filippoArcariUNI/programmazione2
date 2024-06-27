package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractBlock;
import Data.Blocks.Interfaces.DestroyedByTorch;
import Data.Blocks.Interfaces.PickableBlocks;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class SandBlock extends AbstractBlock implements SmeltableBlocks,DestroyedByTorch,PickableBlocks {

    public SandBlock(){
        super();
        this.pickable=true;
        this.content = 's';
        this.fall_through=false;
        this.falls_with_gravity=true;
        this.blockName="Sand Block";
        this.durezza = 2;
    }

    public GlassBlock smelt(){
        return new GlassBlock();
    }
}
