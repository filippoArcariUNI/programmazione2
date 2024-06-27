package Handelrs;

import Controller.MainController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Comparator;

public class OrderData implements EventHandler<ActionEvent>{
    MainController mainController;

    public OrderData(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public void handle(ActionEvent event) {
        mainController.orinaPerData();
    }
}
