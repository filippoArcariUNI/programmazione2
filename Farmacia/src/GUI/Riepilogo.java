package GUI;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.Date;

public class Riepilogo extends HBox {
    private MainController mainController;
    private int capitale;
    private Date data;

    public Riepilogo(MainController mainController) {
        this.mainController = mainController;
        capitale = 30;
        data= new Date();
        this.addElement();
    }

    public void addElement() {
        Text conto = new Text("€ Totali:" + this.capitale);
        Text data = new Text("Data Odierna:" + this.data );
        this.getChildren().add(conto);
        this.getChildren().add(data);
    }

    public int getCapitale() {
        return capitale;
    }

    public void setCapitale(int capitale) {
        this.capitale = capitale;
    }

    public void setMainController(MainController mainController) {
        this.mainController=mainController;
    }
}
