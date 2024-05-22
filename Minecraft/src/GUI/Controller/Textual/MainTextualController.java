package GUI.Controller.Textual;

import GUI.Model.MainView;
import GUI.Printer.FurnacePrinter;
import GUI.Printer.InventoryPrinter;
import GUI.Printer.MainPrinter;
import GUI.Printer.MapPrinter;

public class MainTextualController extends AbstractTextController{
    private MainView  mainView;
    private MapTextualController m ;
    private FurnaceTextualController f;
    private InventroyTextualController i;

    public MainTextualController(MainView mv){
        this.mainView = mv;
        tp= new MainPrinter();
        m=new MapTextualController(mv.getMyMap());
        f= new FurnaceTextualController(mv.getMyFurnace());
        i= new InventroyTextualController(mv.getMyInventory());
    }
    @Override
    void update() {
        ((MainPrinter)tp).update((MapPrinter) m.getTp(),(FurnacePrinter) f.getTp(),(InventoryPrinter) i.getTp());
    }
}
