package Handlers;

import GUI.MainController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class CompraMedicina implements EventHandler<ActionEvent> {
    MainController mainController;

    public CompraMedicina(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public void handle(ActionEvent event) {
        try {
            mainController.compraMedicina();
        } catch (Exception e) {
           Alert alert = new Alert(Alert.AlertType.ERROR,e.getMessage());
           alert.show();
        }
    }
}
