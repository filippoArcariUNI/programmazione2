package GUI.Controller.Fine_Grained;

import Data.Blocks.Interfaces.Block;
import GUI.ClickableBlock.ExternHandler;
import GUI.Model.Furnace;
import GUI.Visual.FurnacePane;

public class FGFurnace extends AbstractFGController{
    Furnace f;
    FurnacePane fp;

    public FGFurnace(Furnace f, FurnacePane fp) {
        super();
        this.f = f;
        this.fp = fp;
    }
    private void setFurnace(){
        Block furnaceInput= f.getInput();
        Block furnaceOut = f.getOut();
        ExternHandler inptPane = fp.getInp();
        ExternHandler outPane = fp.getOut();
        inptPane.changeBlock(furnaceInput);
        outPane.changeBlock(furnaceOut);
    }
    @Override
    public void efficient_redraw() {
        setFurnace();
    }

    @Override
    public void not_efficient_redraw() {
        setFurnace();
    }


}
