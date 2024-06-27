package Model.Medicine;

import Model.Medicine.ConRicetta.ARicetta;
import Model.Medicine.ConRicetta.Ricetta;

import java.util.Date;

public class RealMedicina implements Medicina{
    String nome;
    int costo;
    int costoScontato;
    Date scadenza;
    Ricetta ricetta;

    public RealMedicina(Date scadenza, int costo, String nome) {
        this.scadenza = scadenza;
        this.costo = costo;
        this.nome = nome;
        this.calcolaSconto();
    }

    public RealMedicina(Ricetta ricetta, Date scadenza, int costo, String nome) {
        this(scadenza,costo,nome);
        this.ricetta = ricetta;
        this.calcolaSconto();

    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCosto() {
        return this.costo;
    }

    @Override
    public Date getScadenza() {
        return this.scadenza;
    }

    private void calcolaSconto(){
        if (ricetta == null){
            this.costoScontato=this.costo;
        }else{
            this.costoScontato=this.costo-this.ricetta.getsconto();
        }
    }

    @Override
    public int getCostoScontato() {
        return costoScontato;
    }

    @Override
    public Ricetta getRicetta() {
        return ricetta;
    }
}
