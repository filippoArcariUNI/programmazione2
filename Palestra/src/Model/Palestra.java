package Model;

import Model.Enums.Corso;
import Model.Enums.TipoDisciplina;
import Model.Enums.TipoRilevanza;
import Model.Enums.Universita;
import Model.Persone.*;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Palestra {
    public static final int abbonamentoBase=1000;
    ArrayList<IPersona> utenti;
    ArrayList<IPersona> utentiSelezionati;

    public Palestra() {
        utenti = new ArrayList<>();
        this.addUtenti();
        utentiSelezionati = new ArrayList<>();
        utentiSelezionati.addAll(utenti);
    }

    private void addUtenti() {
        utenti.add(new Studente("Anna","Bianchi","4",1990, Universita.UNIPD, Corso.LM));
        utenti.add(new Studente("Giovanni","Bianchi","3",1995,Universita.UNITN,Corso.LT));
        utenti.add(new StudenteAtleta("Alberto","Ferrari","7",1993,Universita.UNITN,Corso.LM, TipoDisciplina.atletica, TipoRilevanza.Internazionale));
        utenti.add(new StudenteAtleta("Vincenzo","Ferrari","8",1997,Universita.UNITN,Corso.LT, TipoDisciplina.atletica, TipoRilevanza.Nazionale));
        utenti.add(new Persona("Carla","Rossi","2",1990));
        utenti.add(new Persona("Mario","Rossi","2",1950));
        utenti.add(new Atleta("Alice","Verdi","6",1967,TipoDisciplina.curling,TipoRilevanza.Internazionale));
        utenti.add(new Atleta("Giacomo","Verdi","6",1991,TipoDisciplina.nuoto,TipoRilevanza.Nazionale));
    }

    public ArrayList<IPersona> getUtenti() {
        return utenti;
    }

    public ArrayList<IPersona> getUtentiSelezionati() {
        return utentiSelezionati;
    }

    public void setUtentiSelezionati(ArrayList<IPersona> utentiSelezionati) {
        this.utentiSelezionati = utentiSelezionati;
    }
}

