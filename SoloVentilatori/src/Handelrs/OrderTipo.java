package Handelrs;

import Controller.MainController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OrderTipo implements EventHandler<ActionEvent> {
    MainController mainController;

    public OrderTipo(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public void handle(ActionEvent event) {
        this.mainController.ordinaPerTipologia();

    }
}
