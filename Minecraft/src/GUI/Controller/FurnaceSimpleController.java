package GUI.Controller;

import Data.Blocks.Furnace;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.NullBlock;
import GUI.BlockPane;
import GUI.FurnacePane;

public class FurnaceSimpleController implements SimpleController {
    Furnace f;
    FurnacePane fp;
    public FurnaceSimpleController(Furnace myFurnace) {
        f=myFurnace;
        fp=new FurnacePane(new NullBlock());
        redraw();

    }
    @Override
    public void redraw() {
        Block furanceInpt= f.getInput();
        BlockPane inptPane = fp.getInp();
        inptPane.changeBlock(furanceInpt);
        fp.setInp(inptPane);
    }
}
