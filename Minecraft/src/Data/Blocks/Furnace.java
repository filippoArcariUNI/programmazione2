package Data.Blocks;

import Data.BlockFactory;
import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class Furnace extends AbstractSolidBlock {

    private SmeltableBlocks input;
    BlockFactory bf=new BlockFactory();
    private Block out;

    public Furnace(){
        super();
        content ='F';
        blockName="Furnace";
        input= new NullBlock();
        out=new NullBlock();
    }
    public Block is_output(){
        return this.out;
    }

    public void  display_on_out(){
        System.out.println("|| "
            +this.input.getContent()
            +" --> "
            +this.out.getContent()
            +" ||");
    }
    public void smelt(){
        this.out=this.input.smelt();
        this.input=bf.null_block();
    }
    public void  setInput(SmeltableBlocks b){
        this.input=b;
        this.out=b.smelt();
    }
}
