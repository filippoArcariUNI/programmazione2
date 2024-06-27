package Models.Alimentazioni;

import Models.Enums.Alimentazioni;

public class Batteria extends AbstractrElettricita{

    public Batteria() {
        super(Alimentazioni.elettrici);
    }

    @Override
    public int calcolaCostoAlimentazione(int costo) {
        return costo*3;
    }
}
