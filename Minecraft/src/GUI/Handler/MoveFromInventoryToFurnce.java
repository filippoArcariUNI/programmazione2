package GUI.Handler;

import GUI.Controller.MainControllerInterface;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MoveFromInventoryToFurnce extends GenericHandler implements EventHandler<MouseEvent> {
    int index;
    public MoveFromInventoryToFurnce(MainControllerInterface msc, int i) {
        super(msc);
        this.index=i;
    }

    @Override
    public void handle(MouseEvent event) {
        mainSimpleController.move_into_furnace_from_inventory(index);
    }
}
