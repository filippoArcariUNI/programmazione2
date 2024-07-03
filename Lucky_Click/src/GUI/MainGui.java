package GUI;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class MainGui extends VBox {
    Head head;
    Field field;
    MainController mainController;

    public MainGui() {
        mainController = new MainController(this);
        head = new Head(mainController);
        field = new Field(mainController);
        this.getChildren().addAll(head,field);
        this.setAlignment(Pos.CENTER);
    }
}
