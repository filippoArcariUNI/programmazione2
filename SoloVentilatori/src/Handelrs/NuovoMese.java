package Handelrs;

import Controller.MainController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class NuovoMese implements EventHandler<ActionEvent> {
    MainController  mainController;
    public NuovoMese(MainController mainController) {
        this.mainController=mainController;
    }

    @Override
    public void handle(ActionEvent event) {
        this.mainController.nuovoMese();
    }
}
