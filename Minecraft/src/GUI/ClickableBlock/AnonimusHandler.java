package GUI.ClickableBlock;

import Data.Blocks.Interfaces.Block;
import GUI.Controller.MainSimpleController;
import GUI.Visual.BlockPane;

public class AnonimusHandler extends BlockPane{

    public AnonimusHandler(Block b, MainSimpleController mainSimpleController, int i) {
        super(b,0);
        this.setOnMouseClicked(event -> mainSimpleController.move_into_furnace_from_inventory(i));
    }
}
