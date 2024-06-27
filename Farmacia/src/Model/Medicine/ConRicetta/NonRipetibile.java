package Model.Medicine.ConRicetta;

import java.util.Date;

public class NonRipetibile extends ARicetta{

    public NonRipetibile(Date scadenza, String nome) {
        super(0, 10,scadenza, nome);
    }

}
