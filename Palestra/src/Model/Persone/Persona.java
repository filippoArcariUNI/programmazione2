package Model.Persone;

public class Persona implements IPersona {
    private String nome;
    private String cognome;
    private String codFiscale;
    private int annoNascita;

    public Persona(String nome, String cognome, String codFiscale, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFiscale = codFiscale;
        this.annoNascita = annoNascita;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCognome() {
        return cognome;
    }

    public String getCV() {
        return codFiscale;
    }

    @Override
    public int getAnnoNascita() {
        return annoNascita;
    }
}
