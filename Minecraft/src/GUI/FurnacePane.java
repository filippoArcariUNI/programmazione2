package GUI;

import Data.Blocks.Interfaces.SmeltableBlocks;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class FurnacePane extends VBox {
    private BlockPane inp;

    public BlockPane getInp() {
        return inp;
    }

    public BlockPane getOut() {
        return out;
    }

    private BlockPane out;
    public FurnacePane(SmeltableBlocks inpt){
        Text intro = new Text("Furnace");
        Text to = new Text("-->");
        to.setTextAlignment(TextAlignment.CENTER);
        intro.setTextAlignment(TextAlignment.CENTER);
        to.setRotate(90);
        inp = new BlockPane(inpt);
        out = new BlockPane(inpt.smelt());
        super.getChildren().addAll(intro,inp,to,out);
        super.setAlignment(Pos.CENTER);

    }

    public void setInp(BlockPane inp) {
        this.inp = inp;
    }

    public void setOut(BlockPane out) {
        this.out = out;
    }
}
