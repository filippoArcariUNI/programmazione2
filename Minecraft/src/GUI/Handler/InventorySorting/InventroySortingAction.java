package GUI.Handler.InventorySorting;

import GUI.Controller.MainControllerInterface;
import GUI.Controller.Simple.MainSimpleController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class InventroySortingAction extends InventorySorting implements EventHandler<ActionEvent>{

    public InventroySortingAction(MainControllerInterface mc) {
        super(mc);
    }
    @Override
    public void handle(ActionEvent event) {
        orderInvetory();
    }
}
