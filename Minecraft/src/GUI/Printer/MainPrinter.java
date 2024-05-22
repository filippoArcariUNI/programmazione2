package GUI.Printer;

public class MainPrinter implements TextPrinter{
    MapPrinter m;
    FurnacePrinter f;
    InventoryPrinter i;
    public MainPrinter(){};
    public void update(MapPrinter mapPrinter,FurnacePrinter furnacePrinter,InventoryPrinter inventoryPrinter){
        this.m=mapPrinter;
        this.f=furnacePrinter;
        this.i=inventoryPrinter;
    }
    @Override
    public void display_on_out() {
        this.m.display_on_out();
        this.f.display_on_out();
        this.i.display_on_out();
    }
}
