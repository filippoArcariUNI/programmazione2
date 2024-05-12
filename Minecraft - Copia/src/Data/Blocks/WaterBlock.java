package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractBlock;

public class WaterBlock extends AbstractBlock {
    public WaterBlock(){
        fall_through=true;
        falls_with_gravity=true;
        content ='w';
        blockName="Water Block";
    }
}
