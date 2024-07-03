package GUI;

import GUI.Controller.MainController;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class BtnsCategorie extends HBox {
    MainController mainController;
    Button btnTutti;
    Button btnStudenti;
    Button btnAtleti;
    ArrayList<Button> bottoni;

    public BtnsCategorie(MainController mainController) {
        super(5);
        this.mainController = mainController;
        bottoni = new ArrayList<>();
        this.addbtn();
    }

    private void addbtn() {
        btnTutti = new Button("Tutti");
        btnTutti.setOnAction((event -> {
            mainController.mostraTutti();
            this.enableAllBtns();
            btnTutti.setDisable(true);
        }));
        btnStudenti = new Button("Studenti");
        btnStudenti.setOnAction((event -> {
            mainController.mostraStudenti();
            this.enableAllBtns();
            btnStudenti.setDisable(true);
        }));
        btnAtleti = new Button("Atleti");
        btnAtleti.setOnAction((event -> {
            mainController.mostraAtleti();
            this.enableAllBtns();
            btnAtleti.setDisable(true);
        }));
        this.getChildren().addAll(btnTutti,btnStudenti,btnAtleti);
        bottoni.add(btnAtleti);
        bottoni.add(btnStudenti);
        bottoni.add(btnTutti);
    }

    private void enableAllBtns() {
        for (Button button : bottoni) {
            button.setDisable(false);
        }
    }

}
