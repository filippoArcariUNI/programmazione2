package GUI.Handler.AddBlocks;

import GUI.Controller.MainControllerInterface;
import GUI.Handler.GenericHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AddBlockAction extends GenericHandler implements EventHandler<ActionEvent>{
    public AddBlockAction(MainControllerInterface msc) {
        super(msc);
    }

    @Override
    public void handle(ActionEvent event) {
        super.addBlock();
    }
}
