package GUI;

import Data.Blocks.Interfaces.Block;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.Collection;

public class InventoryPane extends HBox {
    private Text text;
    private HBox hBox;

    public InventoryPane(Collection<Block> inventario) {
        text = new Text();
        hBox= new HBox(2);
        super.setAlignment(Pos.CENTER);
        for (Block b : inventario){
            super.getChildren().add(new BlockPane(b));
        }

    }
}
