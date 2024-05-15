package GUI.Controller;

import Data.Blocks.Interfaces.Block;
import GUI.BlockPane;
import GUI.MapPane;
import Interface.Location;
import Interface.Map;

public class MapSimpleController implements SimpleController{
    MapPane mp;
    Map m;
    public MapSimpleController(Map map){
        mp= new MapPane();
        m=map;
        redraw();
    }
    @Override
    public void redraw() {
        for (int i = 0; i < Location.dimZ; i++) {
            for (int j = 0; j < Location.dimX; j++) {
                Location l = new Location(i,j);
                BlockPane currentBp = this.mp.get_block_at_cord(l);
                Block currentBlock = this.m.getBlock(l);
                currentBp.changeBlock(currentBlock);
            }

        }
    }
}
