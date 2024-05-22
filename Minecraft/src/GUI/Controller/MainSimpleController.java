package GUI.Controller;

import Data.Blocks.Interfaces.Block;
import GUI.MainGUI;
import Data.Location;
import GUI.Model.MainView;
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
        mg = new MainGUI(this);
        lstController = new ArrayList<>();
        ic = new InventorySimpleController(mainView.getMyInventory(),mg.getInvetory());
        mc = new MapSimpleController(mainView.getMyMap(),mg.getMappa());
        fc = new FurnaceSimpleController(mainView.getMyFurnace(),mg.getFurnace());

        lstController.add(ic);
        lstController.add(mc);
        lstController.add(fc);
    }
    @Override
    public void redraw() {
       for(SimpleController controller : this.lstController){
            controller.redraw();
       }
    }
    public void smelt(){
        mv.smelt();
        this.redraw();
    }

    public void move_into_inventory_from_furnace(){
        mv.move_into_inventory_from_furnace();
        this.redraw();
    }
    public void move_into_furnace_from_inventory(){
        mv.move_into_furnace_from_inventory(0);
        this.redraw();
    }
    public void pick_up_block(Location l){
        mv.pick_up_block(l);
        this.redraw();

    }
    public void toggle_inventory_comparator(boolean selector){
        mv.toggle_inventory_comparator(selector);
        this.redraw();
    }

    public void randomBlock(Location l , Block b){
        mv.insertRandomBlock(l,b);
        this.redraw();
    }


    public MainView getMv() {
        return mv;
    }

    public void setMv(MainView mv) {
        this.mv = mv;
    }

    public MainGUI getMg() {
        return mg;
    }

    public void setMg(MainGUI mg) {
        this.mg = mg;
    }

    public Collection<SimpleController> getLstController() {
        return lstController;
    }

    public FurnaceSimpleController getFc() {
        return fc;
    }



    public MapSimpleController getMc() {
        return mc;
    }

    public InventorySimpleController getIc() {
        return ic;
    }

}
