package Data.Blocks.AbstractClass;

import Data.Blocks.AbstractClass.AbstractBlock;

public abstract class AbstractSolidBlock extends AbstractBlock {
    public AbstractSolidBlock(){
        fall_through=false;
        falls_with_gravity=false;
    }
}
