package GUI.Controller.Textual;

import GUI.Model.Furnace;
import GUI.Printer.FurnacePrinter;

public class FurnaceTextualController extends AbstractTextController{
    private Furnace furnace;

    public FurnaceTextualController(Furnace f){
        this.furnace=f;
        tp=new FurnacePrinter();
    }
    @Override
    void update() {
        ((FurnacePrinter)tp).update(this.furnace.getInput(),this.furnace.getOut());
    }
}
