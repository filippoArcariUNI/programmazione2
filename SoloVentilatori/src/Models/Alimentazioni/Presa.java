package Models.Alimentazioni;

import Models.Enums.Alimentazioni;

public class Presa extends AbstractrElettricita{

    public Presa() {
        super(Alimentazioni.elettrici);
    }

    @Override
    public int calcolaCostoAlimentazione(int costo) {
        return costo*3;
    }
}
