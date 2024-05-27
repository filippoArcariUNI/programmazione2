package Model.Celle;

import Controller.CellController;
import Model.Coords;
import Views.CellePane;
import javafx.scene.paint.Color;

public class CellaBomba extends Cella{
    private Coords coords;
    public CellaBomba(CellController cellController) {
        super(cellController, Color.BLUE);
        super.setContenuto("Boom!");
    }

    @Override
    public void attivaCella() {
        CellePane cellePane = super.cellController.getCellePane();
        Cella cella;
        for (int i = 0; i < CellePane.SIZE; i++) {

        }
    }
    public void setCoodrs(Coords c){
        this.coords=c;
    }
    private void scopriCelle(Cella cella){
    }
}
