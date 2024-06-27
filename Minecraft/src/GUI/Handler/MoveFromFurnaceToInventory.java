package GUI.Handler;

import GUI.Controller.MainControllerInterface;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MoveFromFurnaceToInventory extends GenericHandler implements EventHandler<MouseEvent> {
    private boolean isInput;
    public MoveFromFurnaceToInventory(MainControllerInterface msc, boolean isInpt){
        super(msc);
        this.isInput=isInpt;
    }
    @Override
    public void handle(MouseEvent event) {
        if(isInput){
            mainSimpleController.move_into_inventory_inpt_furnace();
        }else{
            mainSimpleController.move_into_inventory_out_furnace();
        }

    }
}
