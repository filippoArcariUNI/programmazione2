package Handelrs;

import Controller.MainController;
import View.FansPane;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class AddFanToUser implements EventHandler<MouseEvent> {
    MainController mainController;
    FansPane fansPane;
    public AddFanToUser(MainController mainController1, FansPane fp) {
        this.mainController=mainController1;
        this.fansPane=fp;
    }
    @Override
    public void handle(MouseEvent event) {
        mainController.addAbbonamento(fansPane);
    }
}
