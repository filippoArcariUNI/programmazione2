package GUI;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class Wrapper extends VBox {
    MainController mainController;
    private DatiPiastrella datiPiastrella;
    private BtnNav btnNav;

    public Wrapper(MainController mainController) {
        this.mainController = mainController;
        datiPiastrella = new DatiPiastrella(mainController,mainController.getPiastrella());
        btnNav = new BtnNav(mainController);
        this.getChildren().addAll(datiPiastrella,btnNav);
        this.setPadding(new Insets(5));
    }

    public DatiPiastrella getDatiPiastrella() {
        return datiPiastrella;
    }
}
