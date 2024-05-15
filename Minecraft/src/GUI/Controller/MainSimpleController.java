package GUI.Controller;

import GUI.MainGUI;
import Interface.Location;
import Interface.MainView;

import java.util.ArrayList;
import java.util.Collection;

public class MainSimpleController implements SimpleController{
    MainView mv;
    MainGUI mg;
    Collection <SimpleController> lstController;
    FurnaceSimpleController  fc;
    MapSimpleController mc;
    InventorySimpleController ic;
    public MainSimpleController(MainView mainView){
        mv = mainView;
        mg = new MainGUI();
        lstController = new ArrayList<>();
        ic = new InventorySimpleController(mainView.getMyInventory());
        mc = new MapSimpleController(mainView.getMyMap());
        fc = new FurnaceSimpleController(mainView.getMyFurnace());

        lstController.add(ic);
        lstController.add(mc);
        lstController.add(fc);
    }
    @Override
    public void redraw() {
        lstController.forEach(SimpleController::redraw);
    }
    public void smelt(){
        mv.getMyFurnace().smelt();
        fc.redraw();
    }

    public void move_into_inventory_from_furnace(){
        mv.move_into_inventory_from_furnace();
        fc.redraw();
        ic.redraw();
    }
    public void move_into_furnace_from_inventory(){
        mv.move_into_furnace_from_inventory(0);
        fc.redraw();
        ic.redraw();
    }
    public void pick_up_block(){
        mv.pick_up_block(new Location(0,0));
        ic.redraw();
        mc.redraw();
    }public void toggle_inventory_comparator(){
        mv.toggle_inventory_comparator();
        ic.redraw();
    }
}
