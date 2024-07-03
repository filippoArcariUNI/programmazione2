package Handelrs;

import GUI.Celle.Cella;
import GUI.MainController;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class CellaCliccata implements EventHandler<MouseEvent> {
    MainController mainController;
    Cella cella;

    public CellaCliccata(MainController mainController, Cella cella) {
        this.mainController = mainController;
        this.cella = cella;
    }

    @Override
    public void handle(MouseEvent event) {
        this.mainController.rimuoviCopertura(cella,false);
    }
}
