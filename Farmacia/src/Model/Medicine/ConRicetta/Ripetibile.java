package Model.Medicine.ConRicetta;

import java.util.Date;

public class Ripetibile extends ARicetta{
    public Ripetibile(int ripetibilita, Date scadenza,String nome ) {
        super(ripetibilita, 5,scadenza,nome);
    }
}
