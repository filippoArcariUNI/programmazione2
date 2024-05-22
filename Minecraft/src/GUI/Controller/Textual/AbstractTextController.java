package GUI.Controller.Textual;

import GUI.Printer.TextPrinter;

public abstract class AbstractTextController{
    TextPrinter tp;
    abstract void update();
    public void update_and_display(){
        this.update();
        tp.display_on_out();
    }

    public TextPrinter getTp() {return tp;}
}
