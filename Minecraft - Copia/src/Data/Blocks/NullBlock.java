package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class NullBlock extends AbstractSolidBlock implements SmeltableBlocks {
    public NullBlock(){
        super();
        pickable=false;
        fall_through=false;
        falls_with_gravity=false;
        content ='N';
        blockName="Null Block";
    }
    public Block smelt(){
        return new NullBlock();
    }

}

