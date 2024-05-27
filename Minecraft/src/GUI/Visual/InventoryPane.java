package GUI.Visual;

import Data.Blocks.Interfaces.Block;
import GUI.ClickableBlock.AnonimusHandler;
import GUI.Controller.MainSimpleController;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class InventoryPane extends HBox {
    private Text text;
    private HBox hBox;

    public InventoryPane(ArrayList<Block> inventario, MainSimpleController msc) {
        text = new Text();
        hBox= new HBox(2);
        super.setAlignment(Pos.CENTER);
        for (int i = 0; i < inventario.size(); i++) {
            Block b = inventario.get(i);
            super.getChildren().add(new AnonimusHandler(b,msc,i));
        }
    }
}
