package GUI.Controller;

import GUI.Model.Furnace;
import Data.Blocks.Interfaces.Block;
import GUI.Visual.BlockPane;
import GUI.Visual.FurnacePane;

public class FurnaceSimpleController implements SimpleController {
    Furnace f;
    FurnacePane fp;
    public FurnaceSimpleController(Furnace myFurnace,FurnacePane furnacePane) {
        f=myFurnace;
        fp= furnacePane;
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
