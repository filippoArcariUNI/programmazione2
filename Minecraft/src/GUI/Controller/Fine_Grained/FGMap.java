package GUI.Controller.Fine_Grained;

import Data.Blocks.Interfaces.Block;
import Data.Location;
import GUI.ClickableBlock.ExternHandler;
import GUI.Model.Map;
import GUI.Visual.MapPane;

public class FGMap extends AbstractFGController{
    Map m;
    MapPane mp;

    public FGMap(Map m, MapPane mp) {
        super();
        this.m = m;
        this.mp = mp;
        redraw();
    }

    private void switchPane(Location l){
        ExternHandler currentBp = this.mp.get_block_at_cord(l);
        Block currentBlock = this.m.getBlock(l);
        this.mp.setCell(l,currentBlock);
    }

    @Override
    public void efficient_redraw() {
        this.efficiency_enablers.forEach( o -> {
            switchPane((Location) o);
        });
    }

    @Override
    public void not_efficient_redraw() {
        for (int i = 0; i < Location.dimZ; i++) {
            for (int j = 0; j < Location.dimX; j++) {
                Location l = new Location(i,j);
                this.switchPane(l);
            }
        }
    }

    @Override
    public void add_efficiency_enabler(Object o) {
        if (o instanceof Location){
            super.add_efficiency_enabler(o);
        }
    }
}
