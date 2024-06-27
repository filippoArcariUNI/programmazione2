package Model.Medicine;

import Model.Medicine.ConRicetta.Ricetta;

import java.util.Date;

public interface Medicina {
    public String getNome();
    public int getCosto();
    public Date getScadenza();
    public int getCostoScontato();
    public Ricetta getRicetta();


}
