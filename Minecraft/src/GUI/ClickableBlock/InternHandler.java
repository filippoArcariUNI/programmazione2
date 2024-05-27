package GUI.ClickableBlock;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import GUI.Controller.MainSimpleController;
import GUI.Visual.BlockPane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class InternHandler extends BlockPane implements EventHandler<MouseEvent> {
    private Block block;
    private MainSimpleController mainSimpleController;

    @Override
    public void handle(MouseEvent event) {
        mainSimpleController.move_into_inventory_inpt_furnace();
    }

    public InternHandler(Block b, MainSimpleController msc) {
        super(b,((AbstractSolidBlock) b).getDurezza());
        this.block=b;
        this.mainSimpleController= msc;
    }
}
