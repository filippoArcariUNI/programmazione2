package GUI.Handler.InventorySorting;

import GUI.Controller.MainControllerInterface;
import GUI.Handler.GenericHandler;

public abstract class InventorySorting extends GenericHandler {
    boolean switchInventorySorting=true;
    public InventorySorting(MainControllerInterface mc){
        super(mc);
    }
    protected void orderInvetory(){
        if (this.switchInventorySorting){
            mainSimpleController.toggle_inventory_comparator(true);
        }else{
            mainSimpleController.toggle_inventory_comparator(false);
        }
        this.switchInventorySorting = !switchInventorySorting;
    }

}
