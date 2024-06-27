package GUI.Handler.InventorySorting;

import GUI.Controller.MainControllerInterface;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class InventorySotringKeyPress extends InventorySorting implements EventHandler<KeyEvent> {
    public InventorySotringKeyPress(MainControllerInterface mc) {
        super(mc);
    }

    @Override
    public void handle(KeyEvent event) {
        if (event.getText().equals("s")){
            orderInvetory();
        }
    }
}
