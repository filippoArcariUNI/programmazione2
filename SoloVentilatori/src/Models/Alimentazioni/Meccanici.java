package Models.Alimentazioni;

import Models.Enums.Alimentazioni;

public class Meccanici extends AbstractAlimentazione{
    public Meccanici() {
        super(Alimentazioni.meccanici);
    }

    @Override
    public int calcolaCostoAlimentazione(int costo) {
        return costo;
    }
}
