package Handelrs;

import Controller.MainController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class piuFondi implements EventHandler<ActionEvent> {
    MainController mainController;
    public piuFondi(MainController mainController) {
        this.mainController=mainController;
    }

    @Override
    public void handle(ActionEvent event) {
        this.mainController.addFondi();
    }
}


