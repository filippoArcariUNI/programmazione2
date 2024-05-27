package GUI.Controller;

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
        ExternHandler inptPane = fp.getInp();
        inptPane.changeBlock(furnaceInput);
        fp.setInp(inptPane);

    }
}
