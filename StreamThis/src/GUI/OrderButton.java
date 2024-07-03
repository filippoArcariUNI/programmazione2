package GUI;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class OrderButton extends VBox {
        public OrderButton(MainController mainController) {
        Button btnNome = new Button("Nome");
        btnNome.setOnAction((event -> mainController.nomeOrder()));
        Button btnAnno = new Button("Anno");
        btnAnno.setOnAction((event -> mainController.annoOrder()));
        Button btnTipo = new Button("Tipo");
        btnTipo.setOnAction((event -> mainController.tipoOrder()));
        this.getChildren().addAll(btnNome,btnAnno,btnTipo);
    }
}
