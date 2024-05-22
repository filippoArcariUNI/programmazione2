package GUI.Controller.Textual;

import GUI.Model.Inventory;
import GUI.Printer.InventoryPrinter;

public class InventroyTextualController extends AbstractTextController {
    private Inventory inventory;

    public InventroyTextualController(Inventory i){
        this.inventory=i;
        tp=new InventoryPrinter();
    }
    @Override
    void update() {
        ((InventoryPrinter)tp).update(inventory.getInventario());
    }
}
