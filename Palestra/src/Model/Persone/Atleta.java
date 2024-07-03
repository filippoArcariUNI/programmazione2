package Model.Persone;

import Model.Enums.TipoDisciplina;
import Model.Enums.TipoRilevanza;

public class Atleta extends Persona implements IAtleta{
    private TipoDisciplina disciplina;
    private TipoRilevanza rilevanza;

    public Atleta(String nome, String cognome, String codFiscale, int annoNascita, TipoDisciplina disciplina, TipoRilevanza rilevanza) {
        super(nome, cognome, codFiscale, annoNascita);
        this.disciplina = disciplina;
        this.rilevanza = rilevanza;
    }

    @Override
    public TipoDisciplina getTipoDisciplina() {
        return disciplina;
    }

    @Override
    public TipoRilevanza getRilevanza() {
        return this.rilevanza;
    }
}
