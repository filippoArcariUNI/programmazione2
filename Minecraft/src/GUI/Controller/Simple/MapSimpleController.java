package GUI.Controller.Simple;

import Data.Blocks.Interfaces.Block;
import Data.Location;
import GUI.ClickableBlock.ExternHandler;
import GUI.Model.Map;
import GUI.Visual.MapPane;

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
                ExternHandler currentBp = this.mp.get_block_at_cord(l);
                Block currentBlock = this.m.getBlock(l);
                this.mp.setCell(l,currentBlock);

            }

        }
    }
}
