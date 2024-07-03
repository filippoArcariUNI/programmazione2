package GUI;

import GUI.Celle.Cella;
import GUI.Celle.CelleFIsiche.Divisore;
import GUI.Celle.CelleFIsiche.Moltiplicatore;
import GUI.Utils.Location;

public class MainController {
    MainGui mainGui;

    public MainController(MainGui mainGui) {
        this.mainGui = mainGui;
    }


    public void rimuoviCopertura(Cella cella,boolean isBomba) {
        if (mainGui.head.getTentativi() < mainGui.head.defalutTentativi){
            cella.scopri();
            if (!isBomba){
                mainGui.head.setTentativi(mainGui.head.getTentativi()+1);
            }
            switch (cella.getTipologia()){
                case Base -> mainGui.head.setPunteggio(mainGui.head.getPunteggio()+ Integer.parseInt(cella.getTesto()));
                case Divisore -> mainGui.head.setPunteggio(mainGui.head.getPunteggio()/ Divisore.malus);
                case Motiplicatore -> mainGui.head.setPunteggio(mainGui.head.getPunteggio()* Moltiplicatore.bonus);
                case Bomba -> this.bomba(cella);
            }
            this.mainGui.head.addElement();
        }

    }

    private void bomba(Cella cella) {
        for (int i = 0; i < Field.cellePerLato; i++) {
            Cella trovata = this.mainGui.field.getCella(new Location(cella.getLocation().getY(),i));
            if (!trovata.isScoperta()){
                this.rimuoviCopertura(trovata,true);
            }
        }
        for (int i = 0; i < Field.cellePerLato; i++) {
            Cella trovata = this.mainGui.field.getCella(new Location(i,cella.getLocation().getX()));
            if (!trovata.isScoperta()){
                this.rimuoviCopertura(trovata,true);
            }
        }

    }
}
