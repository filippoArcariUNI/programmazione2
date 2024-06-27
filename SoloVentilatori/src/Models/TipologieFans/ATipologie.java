package Models.TipologieFans;

import Models.Enums.Tipologia;

public abstract class ATipologie {
    protected int maggironazione;
    protected Tipologia tipologia;

    public ATipologie(int maggironazione, Tipologia t ) {
        this.maggironazione = maggironazione;
        this.tipologia = t;
    }
    public int calcolaCostoTipologia(int costo){
        return costo+maggironazione;
    }

    public int getMaggironazione() {
        return maggironazione;
    }
    public Tipologia getTipologia() {
        return tipologia;
    }
}
