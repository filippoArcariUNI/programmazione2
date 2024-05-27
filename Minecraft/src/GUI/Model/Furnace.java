package GUI.Model;

import Data.BlockFactory;
import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Blocks.NullBlock;


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
    public Block getOut(){
        return this.out;
    }


    public void smelt(){
        this.out=this.input.smelt();
        this.input=bf.null_block();
    }
    public void setInput(SmeltableBlocks b){this.input=b;}
    public SmeltableBlocks getInput(){
        SmeltableBlocks t=this.input;
        return t;
    }

    public void setOut(Block out) {this.out = out;}
}
