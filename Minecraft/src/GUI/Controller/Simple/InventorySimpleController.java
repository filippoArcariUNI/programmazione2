package GUI.Controller.Simple;

import GUI.ClickableBlock.AnonimusHandler;
import GUI.Model.Inventory;
import GUI.Visual.InventoryPane;

import java.util.Iterator;
import java.util.Objects;

public class InventorySimpleController implements SimpleController {
    Inventory i;
    InventoryPane ip;

    public InventorySimpleController(Inventory myInventory,InventoryPane inventoryPane){
        i=myInventory;
        ip =inventoryPane;
    }
    @Override
    public void redraw() {
        ip.getChildren().clear();
        ip.addText();
        Iterator<Objects> iterator = (Iterator<Objects>) i.blockIterator();
        int i = 0;
        while (iterator.hasNext()){
            Objects b= iterator.next();
            AnonimusHandler toAdd = new AnonimusHandler(b,ip.getMainSimpleController(),i++);
            toAdd.resettaDurezza();
            ip.getChildren().add(toAdd);
        }
    }

}
