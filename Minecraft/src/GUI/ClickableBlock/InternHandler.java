package GUI.ClickableBlock;

import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import GUI.Controller.MainControllerInterface;
import GUI.Visual.BlockPane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class InternHandler extends BlockPane implements EventHandler<MouseEvent> {
    private Block block;
    private MainControllerInterface mainSimpleController;

    @Override
    public void handle(MouseEvent event) {
        mainSimpleController.move_into_inventory_inpt_furnace();
    }

    public InternHandler(Block b, MainControllerInterface msc) {
        super(b,((AbstractSolidBlock) b).getDurezza());
        this.block=b;
        this.mainSimpleController= msc;
    }
}
