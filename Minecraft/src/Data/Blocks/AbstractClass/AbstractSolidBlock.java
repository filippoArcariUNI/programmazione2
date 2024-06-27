package Data.Blocks.AbstractClass;

import Data.Blocks.Interfaces.PickableBlocks;

public abstract class AbstractSolidBlock extends AbstractBlock implements PickableBlocks {
    public AbstractSolidBlock(){
        fall_through=false;
        falls_with_gravity=false;
        pickable=true;
    }
}
