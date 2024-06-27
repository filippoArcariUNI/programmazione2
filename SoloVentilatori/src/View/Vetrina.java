package View;

import Controller.MainController;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Vetrina extends VBox{
    ArrayList<FansPane> fansPanes;
    MainController mainController;
    public Vetrina(MainController mainController ){
        this.mainController=mainController;
        this.redraw();
    }

    public void redraw() {
        this.getChildren().clear();
        this.fansPanes=mainController.convertIntoFansPane();
        fansPanes.forEach((FansPane e) -> {
            this.getChildren().add(e);
        });
    }

    public ArrayList<FansPane> getFansPanes() {
        return fansPanes;
    }

    public void setFansPanes(ArrayList<FansPane> fansPanes) {
        this.fansPanes = fansPanes;
    }
}
