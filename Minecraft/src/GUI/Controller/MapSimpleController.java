package GUI.Controller;

import Data.Blocks.Interfaces.Block;
import GUI.Visual.BlockPane;
import GUI.Visual.MapPane;
import Data.Location;
import GUI.Model.Map;

public class MapSimpleController implements SimpleController{
    MapPane mp;
    Map m;
    public MapSimpleController(Map map,MapPane mapPane){
        mp = mapPane;
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
