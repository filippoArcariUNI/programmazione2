package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractBlock;

public class AirBlock extends AbstractBlock {
    public AirBlock(){
        super();
        this.content = '.';
        this.fall_through=true;
        this.falls_with_gravity=false;
    }


}
