package GUI.Controller.Fine_Grained;

import Data.BlockFactory;
import Data.Blocks.Interfaces.Block;
import Data.Location;
import GUI.ClickableBlock.ExternHandler;
import GUI.Controller.MainControllerInterface;
import GUI.MainGUI;
import GUI.Model.MainView;
import GUI.Visual.ButtonListPane;
import GUI.Visual.FurnacePane;
import GUI.Visual.InventoryPane;
import GUI.Visual.MapPane;

import java.util.ArrayList;
import java.util.Iterator;

public class FGMainController extends AbstractFGController implements MainControllerInterface {
    FGFurnace fgFurnace;
    FGInventory fgInventory;
    FGMap fgMap;
    MainView mainView;
    MainGUI mainGUI;
    ArrayList<FGController> controllers=new ArrayList<>();
    ButtonListPane buttonListPane;



    public FGMainController(MainView mv){
        super();
        this.mainView=mv;
        this.mainGUI=new MainGUI(this);
        this.fgFurnace = new FGFurnace(mainView.getMyFurnace(),new FurnacePane(new BlockFactory().null_block(),this));
        this.fgInventory = new FGInventory(mainView.getMyInventory(),new InventoryPane(new ArrayList<>(),this));
        this.fgMap = new FGMap(mainView.getMyMap(),new MapPane(false,this));
        this.buttonListPane = this.mainGUI.getButtons();
        controllers.add(this.fgFurnace);
        controllers.add(this.fgInventory);
        controllers.add(this.fgMap);

    }

    @Override
    public void redraw() {
        if (efficiency_enablers.isEmpty()){
            not_efficient_redraw();
        }else{
            efficient_redraw();
        }
    }

    @Override
    public void efficient_redraw() {
        Iterator<Object> iterator = this.efficiency_enablers.iterator();
        while (iterator.hasNext()){
            ((AbstractFGController)iterator.next()).redraw();
        }
    }

    @Override
    public void not_efficient_redraw() {
        for (FGController controller : controllers) {
            controller.redraw();
        }
    }

    @Override
    public void smelt() {
        mainView.smelt();
        this.efficiency_enablers.add(this.fgFurnace);
        redraw();
    }

    @Override
    public void move_into_inventory_inpt_furnace() {
        mainView.move_into_inventory_from_inpt_furnace();
        this.efficiency_enablers.add(this.fgFurnace);
        redraw();
    }

    @Override
    public void move_into_inventory_out_furnace() {
        mainView.move_into_inventory_from_inpt_furnace();
        this.efficiency_enablers.add(this.fgFurnace);
        redraw();
    }

    @Override
    public void move_into_furnace_from_inventory(int index) {
        mainView.move_into_furnace_from_inventory(index);
        this.efficiency_enablers.add(this.fgInventory);
        redraw();
    }

    @Override
    public void pick_up_block(Location l) {
        mainView.pick_up_block(l);
        this.efficiency_enablers.add(this.fgInventory);
        this.efficiency_enablers.add(this.fgMap);
        redraw();
    }

    @Override
    public void toggle_inventory_comparator(boolean selector) {
        mainView.toggle_inventory_comparator(selector);
        this.efficiency_enablers.add(this.fgInventory);
        redraw();
    }

    @Override
    public void randomBlock(Location l, Block b) {
        mainView.insertRandomBlock(l,b);
        this.efficiency_enablers.add(this.fgMap);
        redraw();
    }

    @Override
    public void mineBlock(Location l) {
        ExternHandler bp = this.mainGUI.getMappa().get_block_at_cord(l);
        mainView.mineBlock(l,bp,this.buttonListPane.getCheckBoxPickaxe().isSelected());
    }

    @Override
    public MainView getMv() {
        return this.mainView;
    }

    @Override
    public MainGUI getMg() {
        return this.mainGUI;
    }
}
