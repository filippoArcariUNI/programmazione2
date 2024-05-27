package GUI.Handler.AddBlocks;

import GUI.Controller.MainSimpleController;
import GUI.Handler.GenericHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AddBlockAction extends GenericHandler implements EventHandler<ActionEvent>{
    public AddBlockAction(MainSimpleController msc) {
        super(msc);
    }

    @Override
    public void handle(ActionEvent event) {
        super.addBlock();
    }
}
