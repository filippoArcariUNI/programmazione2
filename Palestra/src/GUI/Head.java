package GUI;

import GUI.Controller.MainController;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Head extends BorderPane {
    MainController mainController;

    public Head(MainController mainController) {
        this.mainController = mainController;
        this.setLeft(new BtnsCategorie(mainController));
        this.setRight(new BtnsOrdinamento(mainController));
        this.setBackground(new Background(new BackgroundFill(Color.CADETBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setPadding(new Insets(5));
    }
}
