package Handlers;

import GUI.MainController;
import GUI.TitoloInAcquisto;
import GUI.TitoloPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MoveToAcquisto implements EventHandler<MouseEvent> {
    MainController mainController;
    TitoloPane titoloPane;

    @Override
    public void handle(MouseEvent event) {
        mainController.acquisto(titoloPane);
    }

    public MoveToAcquisto(MainController mainController, TitoloPane titoloPane) {
        this.mainController = mainController;
        this.titoloPane= titoloPane;
    }
}
