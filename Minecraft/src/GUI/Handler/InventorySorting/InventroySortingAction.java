package GUI.Handler.InventorySorting;

import GUI.Controller.MainSimpleController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class InventroySortingAction extends InventorySorting implements EventHandler<ActionEvent>{

    public InventroySortingAction(MainSimpleController mc) {
        super(mc);
    }
    @Override
    public void handle(ActionEvent event) {
        orderInvetory();
    }
}
