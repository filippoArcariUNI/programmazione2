package Model.Celle;

import Controller.CellController;
import javafx.scene.paint.Color;

public class CellaMoltiplicatore extends Cella{
    public CellaMoltiplicatore(CellController cellController) {
        super(cellController, Color.GREEN);
        super.setContenuto("x2");
    }

    @Override
    public void attivaCella() {

    }
}
