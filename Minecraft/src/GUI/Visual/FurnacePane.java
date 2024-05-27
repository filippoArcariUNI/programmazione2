package GUI.Visual;

import Data.Blocks.Interfaces.SmeltableBlocks;
import GUI.ClickableBlock.ExternHandler;
import GUI.Controller.MainSimpleController;
import GUI.Handler.MoveFromFurnaceToInventory;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class FurnacePane extends VBox {
    private ExternHandler inp;
    private ExternHandler out;


    public ExternHandler getInp() {
        return inp;
    }
    public ExternHandler getOut() {
        return out;
    }
    public FurnacePane(SmeltableBlocks inpt, MainSimpleController msc){
        Text intro = new Text("Furnace");
        Text to = new Text("-->");
        to.setTextAlignment(TextAlignment.CENTER);
        intro.setTextAlignment(TextAlignment.CENTER);
        to.setRotate(90);
        inp = new ExternHandler(inpt, new MoveFromFurnaceToInventory(msc,true));
        out = new ExternHandler(inpt.smelt(), new MoveFromFurnaceToInventory(msc,false));
        super.getChildren().addAll(intro,inp,to,out);
        super.setAlignment(Pos.CENTER);

    }

    public void setInp(ExternHandler inp) {
        this.inp = inp;
    }

    public void setOut(ExternHandler out) {this.out = out;}
}
