package Models.Alimentazioni;

import Models.Enums.Alimentazioni;

public abstract class AbstractAlimentazione {
    Alimentazioni alimentazioni;

    public AbstractAlimentazione(Alimentazioni alimentazioni) {
        this.alimentazioni = alimentazioni;
    }

    public Alimentazioni getAlimentazioni() {
        return alimentazioni;
    }

    public abstract int calcolaCostoAlimentazione(int costo);
}
