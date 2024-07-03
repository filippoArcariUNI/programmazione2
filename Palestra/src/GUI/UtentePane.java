package GUI;

import Model.Enums.Corso;
import Model.Enums.TipoRilevanza;
import Model.Palestra;
import Model.Persone.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class UtentePane extends HBox {
    IPersona persona;
    double prezzoScontato;
    private final double scontoSenior  = 0.35;
    private final double scontoTriennale  = 0.40;
    private final double scontoMagistrale  = 0.20;
    private final double scontoInternazionale  = 0.50;
    private final double scontoNazionale  = 0.30;

    public UtentePane(IPersona persona) {
        super(2);
        this.persona = persona;
        this.addElement();

    }

    private void addElement() {
        Text nome = new Text(persona.getNome());
        Text cognome = new Text(persona.getCognome());
        Text cv = new Text(persona.getCV());
        Text annoNascita = new Text(persona.getAnnoNascita()+"");
        this.getChildren().addAll(nome,cognome,cv,annoNascita);
        if (persona instanceof IAtleta){
            Text discipina = new Text(((IAtleta)persona).getTipoDisciplina().toString());
            Text rilevanza = new Text(((IAtleta)persona).getRilevanza().toString());
            this.getChildren().addAll(discipina,rilevanza);
        }else if (persona instanceof IStudente) {
            Text uni = new Text(((IStudente)persona).getUniversita().toString());
            Text corso = new Text(((IStudente)persona).getCorso().toString());
            this.getChildren().addAll(uni,corso);
        }
        this.calcolaSconto();
        this.getChildren().add(new Text("| Tariffa" + prezzoScontato));
    }

    private void calcolaSconto(){
        if (persona instanceof IStudente){
            if (((IStudente)persona).getCorso().equals(Corso.LM)){
                prezzoScontato = Palestra.abbonamentoBase * (1-scontoMagistrale);
            } else if (((IStudente)persona).getCorso().equals(Corso.LT)) {
                prezzoScontato = Palestra.abbonamentoBase * (1-scontoTriennale);
            }
        }
        else if (persona instanceof IAtleta){
            if (((IAtleta)persona).getRilevanza().equals(TipoRilevanza.Internazionale)){
                prezzoScontato = Palestra.abbonamentoBase * (1-scontoInternazionale);
            } else if (((IAtleta)persona).getRilevanza().equals(TipoRilevanza.Nazionale)) {
                prezzoScontato = Palestra.abbonamentoBase * (1-scontoInternazionale);
            }
        }else{
            if ((persona).getAnnoNascita() <= 1968){
                prezzoScontato = Palestra.abbonamentoBase * (1-scontoSenior);
            }else{
                prezzoScontato = Palestra.abbonamentoBase;
            }
        }

    }


}
