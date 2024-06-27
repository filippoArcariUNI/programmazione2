package GUI.ClickableBlock;

import Data.Blocks.Interfaces.Block;
import GUI.Controller.MainControllerInterface;
import GUI.Visual.BlockPane;

public class AnonimusHandler extends BlockPane{

    public AnonimusHandler(Object b, MainControllerInterface mainSimpleController, int i) {
        super((Block) b);
        this.setOnMouseClicked(event -> mainSimpleController.move_into_furnace_from_inventory(i));
    }
}
