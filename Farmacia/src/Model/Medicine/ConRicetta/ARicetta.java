package Model.Medicine.ConRicetta;

import java.util.Date;

public abstract class ARicetta implements Ricetta{
    private int ripetibilita;
    private int sconto;
    private Date scadenza;
    private String nome;
    public ARicetta(int ripetibilita, int sconto, Date scadenza,String nome){
        this.ripetibilita=ripetibilita;
        this.sconto=sconto;
        this.scadenza = scadenza;
        this.nome=nome;

    }

    @Override
    public int getRipetibilita() {
        return ripetibilita;
    }

    @Override
    public int getsconto() {

        return sconto;
    }

    @Override
    public String toString() {
        String testo = String.valueOf(this.ripetibilita);
        if (ripetibilita != 0){
            testo="Non Ripetibile";
        }
        return "Medicinale con Ricetta" + testo;
    }

    @Override
    public Date getScadenza() {
        return this.scadenza;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
