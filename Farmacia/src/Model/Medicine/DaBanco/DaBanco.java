package Model.Medicine.DaBanco;

import Model.Medicine.ConRicetta.ARicetta;

import java.util.Date;

public class DaBanco extends ARicetta{
    public DaBanco(Date scadeanza , String nome) {
        super(0,0,scadeanza,nome);
    }
}
