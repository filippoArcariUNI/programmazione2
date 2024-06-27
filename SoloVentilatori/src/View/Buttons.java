package View;

import Controller.MainController;
import Handelrs.NuovoMese;
import Handelrs.piuFondi;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Buttons extends VBox {
    MainController mainController;
    public Buttons(MainController mainController) {
        super();
        this.mainController=mainController;
        this.addElement();
    }

    private void addElement() {
        Button btnProssimo = new Button("Prossimo Mese");
        btnProssimo.setOnAction(new NuovoMese(mainController));
        this.getChildren().add(btnProssimo);
        Button btnFondi = new Button("+100 Fondi");
        btnFondi.setOnAction(new piuFondi(mainController));
        this.getChildren().add(btnFondi);
    }
}
