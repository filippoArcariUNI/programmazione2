package GUI.Visual;

import Data.Blocks.Interfaces.Block;
import GUI.ClickableBlock.AnonimusHandler;
import GUI.Controller.MainControllerInterface;
import GUI.Controller.Simple.MainSimpleController;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class InventoryPane extends HBox {
    private Text text;
    private HBox hBox;
    private MainControllerInterface mainSimpleController;


    public MainControllerInterface getMainSimpleController() {
        return mainSimpleController;
    }

    public InventoryPane(ArrayList<Block> inventario, MainControllerInterface msc) {

        hBox= new HBox(2);
        this.mainSimpleController= msc;
        super.setAlignment(Pos.CENTER);

        for (int i = 0; i < inventario.size(); i++) {
            Block b = inventario.get(i);
            super.getChildren().add(new AnonimusHandler(b,msc,i));
        }
    }

    public void addText() {
        text = new Text("Inventario ->");
        super.getChildren().add(text);
    }
}
