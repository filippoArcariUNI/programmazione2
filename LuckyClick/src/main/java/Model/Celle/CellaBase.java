package Model.Celle;

import Controller.CellController;
import Views.StatsPane;
import javafx.scene.paint.Color;

import java.util.Random;

public class CellaBase extends Cella{

    public CellaBase(CellController c) {
        super(c, Color.WHITE);
    }


    public void setContenuto() {
        Random r = new Random();
        int contenuto = (r.nextInt(10)+1)*100;
        super.setContenuto(contenuto + "");
    }

    @Override
    public void attivaCella() {
        StatsPane sp= super.cellController.getStatsPane();
        sp.decrementaTentativi();
        int punteggio= sp.getPunteggio() + Integer.parseInt(getContenuto());
        sp.setPunteggio(punteggio);
    }
}
