package GUI.Handler;

import Data.Location;
import GUI.Controller.MainSimpleController;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MoveFromMaptoInventory extends  GenericHandler implements EventHandler<MouseEvent> {
    Location blockLocation;
    public MoveFromMaptoInventory(Location l, MainSimpleController msc){
        super(msc);
        this.blockLocation = l;
    }
    @Override
    public void handle(MouseEvent event) {
        mainSimpleController.mineBlock(this.blockLocation);
    }

}
