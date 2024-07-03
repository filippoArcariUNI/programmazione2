package Model.Persone;

import Model.Enums.Corso;
import Model.Enums.TipoDisciplina;
import Model.Enums.TipoRilevanza;
import Model.Enums.Universita;

public class StudenteAtleta extends Studente implements IAtleta {
    private TipoDisciplina disciplina;
    private TipoRilevanza rilevanza;

    public StudenteAtleta(String nome, String cognome, String codFiscale, int annoNascita, Universita universita, Corso corso, TipoDisciplina disciplina, TipoRilevanza rilevanza) {
        super(nome, cognome, codFiscale, annoNascita, universita, corso);
        this.disciplina = disciplina;
        this.rilevanza = rilevanza;
    }

    @Override
    public TipoDisciplina getTipoDisciplina() {
        return this.disciplina;
    }

    @Override
    public TipoRilevanza getRilevanza() {
        return this.rilevanza;
    }
}
