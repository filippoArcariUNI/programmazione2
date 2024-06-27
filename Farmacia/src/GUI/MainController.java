package GUI;

import Model.Medicine.ConRicetta.Ricetta;
import Model.Medicine.Medicina;
import javafx.application.Platform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class MainController {
    Acquisto acquisto;
    Vetrina vetrina;
    Ricette ricette;
    Riepilogo riepilogo;
    public MainController(Vetrina vetrina, Acquisto acquisto, Riepilogo riepilogo, Ricette ricette) {
        this.acquisto=acquisto;
        this.vetrina=vetrina;
        this.ricette= ricette;
        this.riepilogo=riepilogo;
    }
    private Medicina trovaMedicina(Ricetta ricetta){
        for (Medicina medicina : this.vetrina.vetrinas) {
            if (medicina.getNome().equals(ricetta.getNome())){
                return medicina;
            }
        }
        return null;
    }
    private Ricetta trovaRicetta(Medicina medicina){
        for (Ricetta ricetta : this.ricette.getRicette()) {
            if (ricetta.getNome().equals(medicina.getNome())){
                return ricetta;
            }
        }
        return null;
    }
    public void compraMedicina() throws Exception {
        Medicina medicina = this.acquisto.getMedicinainAcquisto().getMedicina();
        Ricetta ricetta = this.trovaRicetta(medicina);
        if (medicina.getScadenza().before(new Date())){
            throw new Exception("Medicina Scaduta");
        }else if (medicina.getCosto() > riepilogo.getCapitale()){
            throw new Exception("Mancano soldi");
        } else {
            assert ricetta != null;
            if (medicina.getScadenza().before(ricetta.getScadenza())) {
                throw new Exception("Ricetta Scaduta");
            }else if (ricetta.getRipetibilita() <= 0){
                throw new Exception("Hai già usato questa ricetta");
            }else{
                this.riepilogo.setCapitale(riepilogo.getCapitale()-medicina.getCostoScontato());
                this.acquisto.setMedicinainAcquisto(null);
                this.redraw();
            }
        }

    }

    private void redraw() {
        this.riepilogo.addElement();
        this.ricette.insertElement();
        this.acquisto.addelement();
        System.out.println(this.acquisto.getChildren().toString());
    }
    public void MettiRicettaSulBanco(Ricetta ricetta) throws Exception {
        Medicina trovata=this.trovaMedicina(ricetta);
        if (trovata==null){
            throw new Exception("Medicina non presente");
        }
        this.acquisto.setMedicinainAcquisto(new MedicinainVetrina(trovata,this));
        this.redraw();
    }
}
