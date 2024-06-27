package GUI;

import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainGUI extends BorderPane {
    MainController mainController;
    Vetrina vetrina;
    Acquisto acquisto;
    Riepilogo riepilogo;
    Ricette ricette;
    public MainGUI() {
        // Initialize components without controller first
        this.vetrina = new Vetrina(null);
        this.acquisto = new Acquisto(null);
        this.ricette = new Ricette(null);
        this.riepilogo = new Riepilogo(null);

        // Now initialize the MainController with the correct references
        this.mainController = new MainController(vetrina, acquisto, riepilogo, ricette);

        // Set the main controller for each component
        this.vetrina.setMainController(mainController);
        this.acquisto.setMainController(mainController);
        this.ricette.setMainController(mainController);
        this.riepilogo.setMainController(mainController);
        this.addElement();
    }

    private void addElement() {
        this.setLeft(new Vetrina(mainController));
        this.setCenter(new Acquisto(mainController));
        this.setRight(new Ricette(mainController));
        Riepilogo r = new Riepilogo(mainController);
        this.setBottom(r);
        BorderPane.setAlignment(r, Pos.BOTTOM_RIGHT);
    }
}
