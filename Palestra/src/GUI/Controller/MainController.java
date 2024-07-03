package GUI.Controller;

import GUI.MainGUI;
import GUI.UtentePane;
import Model.Ordinamento.PerEta;
import Model.Ordinamento.PerNome;
import Model.Palestra;
import Model.Persone.IAtleta;
import Model.Persone.IPersona;
import Model.Persone.IStudente;

import java.util.ArrayList;

public class MainController {
    MainGUI mainGUI;
    Palestra palestra;

    public MainController(MainGUI mainGUI) {
        this.mainGUI = mainGUI;
        this.palestra = new Palestra();
    }

    public Palestra getPalestra() {
        return palestra;
    }
    public ArrayList<UtentePane> convertoIntoPanes(){
        ArrayList<UtentePane> t = new ArrayList<>();
        for (IPersona persona : this.palestra.getUtenti()) {
            t.add(new UtentePane(persona));
        }
        return t;
    }
    public void ordinaPerNome(){
        this.mainGUI.getUtenti().getUtenti().sort(new PerNome());
        this.mainGUI.redraw();
    }
    public void ordinaPerEta(){
        this.mainGUI.getUtenti().getUtenti().sort(new PerEta());
        this.mainGUI.redraw();
    }
    public void mostraTutti(){
        this.mainGUI.getUtenti().setUtenti(this.getPalestra().getUtenti());
        this.mainGUI.redraw();
    }
    public void mostraAtleti(){
        ArrayList<IPersona> t =new ArrayList<>();
        for (IPersona persona : this.palestra.getUtenti()) {
            if (persona instanceof IAtleta){
                t.add(persona);
            }
        }
        this.mainGUI.getUtenti().setUtenti(t);
        this.mainGUI.redraw();
    }

    public void mostraStudenti() {
        ArrayList<IPersona> t =new ArrayList<>();
        for (IPersona persona : this.palestra.getUtenti()) {
            if (persona instanceof IStudente){
                t.add(persona);
            }
        }
        this.mainGUI.getUtenti().setUtenti(t);
        this.mainGUI.redraw();
    }
}
