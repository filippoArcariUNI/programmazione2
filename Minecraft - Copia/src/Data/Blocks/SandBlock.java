package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractBlock;
import Data.Blocks.Interfaces.DestroyedByTorch;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class SandBlock extends AbstractBlock implements SmeltableBlocks,DestroyedByTorch{

    public SandBlock(){
        super();
        this.pickable=true;
        this.content = 's';
        this.fall_through=false;
        this.falls_with_gravity=true;
        this.blockName="Sand Block";
    }

    public GlassBlock smelt(){
        return new GlassBlock();
    }
}
