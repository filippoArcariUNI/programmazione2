package GUI;

import Model.Persone.IPersona;
import Model.Persone.Persona;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Utenti extends VBox {

    private ArrayList<IPersona> utenti;

    public Utenti(ArrayList<IPersona> utentePanes) {
        this.utenti = utentePanes;
        addUtenti();
    }

    public void addUtenti() {
        this.getChildren().clear();
        for (IPersona persona : utenti) {
            this.getChildren().add(new UtentePane(persona));
        }
    }

    public void setUtenti(ArrayList<IPersona> utenti) {
        this.utenti = utenti;
    }

    public ArrayList<IPersona> getUtenti() {
        return utenti;
    }
}
