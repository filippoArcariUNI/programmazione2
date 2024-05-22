package GUI.Printer;

import Data.Location;
import GUI.Model.Map;

public class MapPrinter implements TextPrinter{
    private Map m;

    public MapPrinter(){}
    public void update(Map map){
        this.m=map;
    }
    @Override
    public void display_on_out(){
        for (int i = 0; i< Location.dimZ; i++){
            for (int j=0;j<Location.dimX;j++){
                char t = this.m.getBlock(new Location(i,j)).getContent();
                System.out.print(t);
            }
            System.out.print("\n");
        }
    }
}
