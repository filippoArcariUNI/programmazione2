package GUI.Printer;

import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;

public class FurnacePrinter implements TextPrinter{
    private SmeltableBlocks in;
    private Block out;
    public FurnacePrinter(){};
    public void update(SmeltableBlocks input,Block out){
        this.in=input;
        this.out=out;

    }
    @Override
    public void display_on_out() {
        System.out.println("|| " + in.getContent() +"--> "+ out.getContent() +"||");
    }
}
