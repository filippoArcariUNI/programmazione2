package GUI;

import GUI.Controller.MainController;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MainGUI extends BorderPane {
    MainController mainController;
    Head head;
    Utenti utenti;

    public MainGUI() {
        mainController = new MainController(this);
        head = new Head(mainController);
        utenti = new Utenti(mainController.getPalestra().getUtentiSelezionati());
        Button btnUscita = new Button("Exit");
        this.setTop(head);
        this.setCenter(utenti);
        this.setBottom(btnUscita);
        btnUscita.setOnAction(event -> btnUscita.getScene().getWindow().hide());
    }
    public void redraw(){
        this.utenti.addUtenti();
    }

    public Head getHead() {
        return head;
    }

    public Utenti getUtenti() {
        return utenti;
    }

}
