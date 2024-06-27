package GUI.Controller.Simple;

import Data.Blocks.Interfaces.Block;
import GUI.ClickableBlock.ExternHandler;
import GUI.Model.Furnace;
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
        Block furnaceInput= f.getInput();
        Block furnaceOut = f.getOut();
        ExternHandler inptPane = fp.getInp();
        ExternHandler outPane = fp.getOut();
        inptPane.changeBlock(furnaceInput);
        outPane.changeBlock(furnaceOut);
    }
}
