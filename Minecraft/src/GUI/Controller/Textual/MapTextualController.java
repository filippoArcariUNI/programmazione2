package GUI.Controller.Textual;

import GUI.Model.Map;
import GUI.Printer.MapPrinter;

public class MapTextualController extends AbstractTextController{
    private Map map;
     MapTextualController(Map mp){
        this.map=mp;
        tp=new MapPrinter();
    }

    @Override
    void update() {
        ((MapPrinter)tp).update(this.map);
    }
}
