package GUI;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BtnNav extends HBox {
    MainController mainController;

    public BtnNav(MainController mainController) {
        this.mainController = mainController;
        Button btnNext = new Button("Next>");
        Button btnPrev= new Button("<Prev");
        btnPrev.setDisable(true);
        btnNext.setOnAction((event -> {
            btnNext.setDisable(false); btnPrev.setDisable(false);

            if(mainController.getIndexPiastrelle() >= mainController.getCatalogo().size()-1){
                btnNext.setDisable(true);
                btnPrev.setDisable(false);
            }else{
                mainController.nextPiastrella();
            }

        }));
        btnPrev.setOnAction((event -> {
            btnNext.setDisable(false); btnPrev.setDisable(false);
            if(mainController.getIndexPiastrelle() <= 0){
                btnNext.setDisable(false);
                btnPrev.setDisable(true);
            }else {
                mainController.prevPiastrella();
            }
        }));
        this.getChildren().addAll(btnPrev,btnNext);
        this.setPadding(new Insets(10));
    }


}
