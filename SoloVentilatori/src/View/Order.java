package View;

import Controller.MainController;
import Handelrs.OrderData;
import Handelrs.OrderTipo;
import Models.Comparator.CompData;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Order extends VBox {
    Button perTipo;
    Button perData;
    MainController mainController;

    public Order(MainController mainController) {
        this.mainController=mainController;
        this.addElement();
    }

    private void addElement() {
        perData=new Button("Ordina per Data");
        perTipo=new Button("Ordina per Tipo");
        perData.setOnAction(new OrderData(mainController));
        perTipo.setOnAction(new OrderTipo(mainController));
        this.getChildren().add(perTipo);
        this.getChildren().add(perData);

    }
}
