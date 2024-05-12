package GUI;

import Data.Blocks.AirBlock;
import Data.Blocks.Interfaces.Block;
import Interface.Exteptions.WrongCoordinatesException;
import Interface.Location;
import Interface.MainView;
import Interface.Map;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class MapPane extends GridPane{
    GridPane gp;
    public MapPane(){
        gp=new GridPane();
        try {
            initialise_air();
        } catch (WrongCoordinatesException e) {
            throw new RuntimeException(e);
        }
        super.setAlignment(Pos.CENTER);
    }
    public MapPane(boolean allAir){
        this();
        if(!allAir){
            try {
                initialise_random(new MainView());
            } catch (WrongCoordinatesException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void initialise_random(MainView mv) throws WrongCoordinatesException {
        Map matrix = mv.getMyMap();
        for (int i = 0; i < Location.dimZ; i++) {
            for(int j = 0; j < Location.dimX; j++) {
                Location l = new Location(i,j);
                setCell(l, matrix.getBlock(l));
            }
        }
    }

    private void initialise_air() throws WrongCoordinatesException {
        for (int i = 0; i < Location.dimZ; i++) {
            for(int j = 0; j < Location.dimX; j++) {
                setCell(new Location(i,j),new AirBlock());
            }
        }

    }

    public BlockPane get_block_at_cord(Location l){
        return (BlockPane) getElementAt(this,l);
    }

    public void setCell(Location l, Block b){
        BlockPane selected = this.get_block_at_cord(l);
        if(selected == null){
            super.add(new BlockPane(b),l.getX(),l.getZ());
        }else{
            selected.changeBlock(b);
        }
    }


    public static Node getElementAt(GridPane gp, Location l ) {
        for (Node x :gp.getChildren()) {
            if ((GridPane.getRowIndex(x) == l.getZ()) && (GridPane.getColumnIndex(x) == l.getX())) {
                return x;
            }
        }
        return null;
    }
}
