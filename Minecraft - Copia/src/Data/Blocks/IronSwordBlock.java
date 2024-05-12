package Data.Blocks;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.IronSword;

public class IronSwordBlock extends AbstractSolidBlock implements IronSword{
    IronSwordBlock(){
        super();
        blockName ="Iron Sword";
        content ='I';
    }
}
