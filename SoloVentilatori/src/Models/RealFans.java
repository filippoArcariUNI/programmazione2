package Models;

import Models.Alimentazioni.AbstractAlimentazione;
import Models.Enums.Marche;
import Models.TipologieFans.ATipologie;

public  class RealFans implements Fans{
    private Marche marca;
    private int costo;
    private ATipologie tipologia;
    private AbstractAlimentazione alimentazione;


    public RealFans(Marche marca, ATipologie tipologia, AbstractAlimentazione a) {
        this.marca = marca;
        this.tipologia= tipologia;
        this.alimentazione=a;
        this.costo = 10;
        this.calcolaCosto();
    }
    @Override
    public ATipologie getTipologia() {
        return tipologia;
    }


    @Override
    public Marche getMarca() {
        return marca;
    }

    @Override
    public int getCosto() {
        return costo;
    }
    public int calcolaCosto(){
        this.costo = this.tipologia.calcolaCostoTipologia(this.costo);
        this.costo= this.alimentazione.calcolaCostoAlimentazione(this.costo);
        return this.costo;
    }

    @Override
    public String toString() {

        return this.marca.name() + "\nTipo:" + tipologia.getTipologia().name() +
                " Alimentazione: "+ alimentazione.getAlimentazioni().name()+
                "\nCosto:"+ this.costo;
    }
}
