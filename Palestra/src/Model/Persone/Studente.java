package Model.Persone;

import Model.Enums.Corso;
import Model.Enums.Universita;

public class Studente extends Persona implements IStudente{
    private Universita universita;
    private Corso corso;

    public Studente(String nome, String cognome, String codFiscale, int annoNascita, Universita universita, Corso corso) {
        super(nome, cognome, codFiscale, annoNascita);
        this.universita = universita;
        this.corso = corso;
    }

    @Override
    public Corso getCorso() {
        return corso;
    }

    @Override
    public Universita getUniversita() {
        return universita;
    }
}
