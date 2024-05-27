package Views;

import Controller.CellController;
import Model.Celle.*;
import Model.Coords;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Random;

public class CellePane extends GridPane {
    public static int SIZE = 10;
    private CellController c;
    public CellePane(CellController c) {
        super();
        this.c = c;
    }
    private void riempi(CellController c){
        ArrayList<Cella> arrCelle = new ArrayList<>(SIZE*SIZE);
        for (int i = 0; i <SIZE*SIZE; i++) {
            if(i<75){
                arrCelle.add(i,new CellaBase(c));
            } else if (i<85) {
                arrCelle.add(i,new CellaDivisiore(c));

            } else if (i<95) {
                arrCelle.add(i,new CellaMoltiplicatore(c));

            }else {
                arrCelle.add(i,new CellaBomba(c));
            }
        }
        Random r = new Random();
        int bound = SIZE * SIZE;
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                int randomIndex= r.nextInt(bound);
                Cella randomCell =  arrCelle.get(randomIndex);
                if (randomCell instanceof CellaBomba){
                    ((CellaBomba)randomCell).setCoodrs(new Coords(i,j));
                }
                arrCelle.remove(randomIndex);
                super.add(randomCell,j,i);
                bound--;
            }

        }

    }
}
