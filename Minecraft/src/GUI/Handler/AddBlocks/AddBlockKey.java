package GUI.Handler.AddBlocks;

import GUI.Controller.MainControllerInterface;
import GUI.Handler.GenericHandler;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class AddBlockKey extends GenericHandler implements EventHandler<KeyEvent> {
    private static int NUMBLOCCHI = 10;
    public AddBlockKey(MainControllerInterface msc) {
        super(msc);
    }

    @Override
    public void handle(KeyEvent event) {
        if(event.getText().equals("n")){
            super.addBlock();
        } else if (event.getText().equals("r")) {
            for (int i = 0; i < NUMBLOCCHI; i++) {
                super.addBlock();
            }
        }
    }
}
