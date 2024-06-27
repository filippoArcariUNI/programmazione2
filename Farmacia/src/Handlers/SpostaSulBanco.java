package Handlers;

import GUI.MainController;
import GUI.Riepilogo;
import Model.Medicine.ConRicetta.Ricetta;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SpostaSulBanco implements EventHandler<ActionEvent>{
    MainController mainController;
    Ricetta ricetta;

    public SpostaSulBanco(MainController mainController,Ricetta ricetta) {
        this.mainController = mainController;
        this.ricetta = ricetta;
    }

    @Override
    public void handle(ActionEvent event) {
        try {
            mainController.MettiRicettaSulBanco(ricetta);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
}
