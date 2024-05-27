package Model.Celle;

import Controller.CellController;
import Views.StatsPane;
import javafx.scene.paint.Color;

public class CellaDivisiore extends Cella{
    public CellaDivisiore(CellController cellController) {
        super(cellController, Color.RED);
        super.setContenuto("/2");
    }

    @Override
    public void attivaCella() {
        StatsPane s = super.cellController.getStatsPane();
        int p = s.getPunteggio()/2;
        s.setPunteggio(p);
    }
}
