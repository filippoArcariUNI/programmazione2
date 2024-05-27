package GUI.ClickableBlock;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import GUI.Handler.GenericHandler;
import GUI.Visual.BlockPane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ExternHandler extends BlockPane{
    public ExternHandler(Block b, GenericHandler el) {
        super(b,((AbstractSolidBlock)b).getDurezza());
        this.setOnMouseClicked((EventHandler<MouseEvent>) el);
    }
}
