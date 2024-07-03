package GUI;

import Model.Titolo;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Head extends HBox {
    private MainController mainController;
    List<TitoloPane> titoloPanes;

    public Head(MainController mainController, List<TitoloPane> titolos) {
        this.mainController = mainController;
        this.titoloPanes= titolos;
        this.addElement();
    }

    private void addElement() {
        Button btnsx = new Button("<");
        Button btndx = new Button(">");
        btnsx.setOnAction((event -> mainController.decreaseIndex()));
        btndx.setOnAction((event -> mainController.increaseIndex()));
        super.getChildren().add(btnsx);

        this.addTitoli(1);
        super.getChildren().add(btndx);
    }

    protected void addTitoli(int index) {
            super.getChildren().addAll(titoloPanes);
    }


    public List<TitoloPane> getTitoloPanes() {
        return titoloPanes;
    }

    public void setTitoloPanes(List<TitoloPane> titoloPanes) {
        this.titoloPanes = titoloPanes;
    }

}
