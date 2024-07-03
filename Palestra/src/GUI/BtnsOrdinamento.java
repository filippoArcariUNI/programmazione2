package GUI;

import GUI.Controller.MainController;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BtnsOrdinamento extends HBox {
    MainController mainController;
    private Button btnPerNome;
    private Button btnPerEta;
    public BtnsOrdinamento(MainController mainController) {
        super(5);
        this.mainController=mainController;
        this.addBtn();
    }

    private void addBtn() {
        btnPerNome = new Button("per Nome");
        btnPerNome.setOnAction((event -> mainController.ordinaPerNome()));
        btnPerEta = new Button("per Età");
        btnPerEta.setOnAction((event -> mainController.ordinaPerEta()));
        this.getChildren().addAll(btnPerNome,btnPerEta);
    }
}