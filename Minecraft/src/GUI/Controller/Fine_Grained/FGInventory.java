package GUI.Controller.Fine_Grained;

import GUI.ClickableBlock.AnonimusHandler;
import GUI.Model.Inventory;
import GUI.Visual.InventoryPane;

import java.util.Collection;

public class FGInventory extends AbstractFGController{
    InventoryPane ip;
    Inventory i;


    public FGInventory (Inventory i,InventoryPane ip) {
        super();
        this.ip = ip;
        this.i = i;
    }


    private void insertIntoInventory(Collection<Object> newBlocks){
        int index=0;
        for (Object b : newBlocks) {
            AnonimusHandler toAdd = new AnonimusHandler(b,ip.getMainSimpleController(),index++);
            toAdd.resettaDurezza();
            ip.getChildren().add(toAdd);
        }
    }
    @Override
    public void efficient_redraw() {
        this.insertIntoInventory(this.efficiency_enablers);
    }
    @Override
    public void not_efficient_redraw() {
        this.insertIntoInventory(this.i.blockIterator());
    }
}
