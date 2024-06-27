package Model.Medicine.ConRicetta;

import java.util.Date;

public interface Ricetta {
    public int getRipetibilita();
    public int getsconto();
    public Date getScadenza();
    public String getNome();
}
