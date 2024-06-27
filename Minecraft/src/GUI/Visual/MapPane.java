package GUI.Visual;

import Data.Blocks.AirBlock;
import Data.Blocks.Interfaces.Block;
import Data.Exceptions.WrongCoordinatesException;
import Data.Location;
import GUI.ClickableBlock.ExternHandler;
import GUI.Controller.MainControllerInterface;
import GUI.Handler.MoveFromMaptoInventory;
import GUI.Model.MainView;
import GUI.Model.Map;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class MapPane extends GridPane{
    private GridPane gp;
    private MainControllerInterface mainSimpleController;
    public MapPane(MainControllerInterface msc){
        gp=new GridPane();
        this.mainSimpleController = msc;
        try {
            initialise_air();
        } catch (WrongCoordinatesException e) {
            throw new RuntimeException(e);
        }
        super.setAlignment(Pos.CENTER);
    }
    public MapPane(boolean allAir, MainControllerInterface msc){
        this(msc);
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

    public ExternHandler get_block_at_cord(Location l){
        return (ExternHandler) getElementAt(this,l);
    }

    public void setCell(Location l, Block b){
        ExternHandler selected = this.get_block_at_cord(l);
        if(selected == null){
            super.add(new ExternHandler(b,new MoveFromMaptoInventory(l,this.mainSimpleController)),l.getX(),l.getZ());
        }else{
            selected.changeBlock(b);
        }
    }


    private Node getElementAt(GridPane gp, Location l ) {
        for (Node x :gp.getChildren()) {
            if ((GridPane.getRowIndex(x) == l.getZ()) && (GridPane.getColumnIndex(x) == l.getX())) {
                return x;
            }
        }
        return null;
    }

    public GridPane getGp() {return gp;}
}
