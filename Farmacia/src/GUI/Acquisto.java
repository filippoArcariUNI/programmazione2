package GUI;

import Handlers.CompraMedicina;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Acquisto extends VBox{
    private MedicinainVetrina medicinainAcquisto;
    private MainController mainController;

    public Acquisto(MainController mainController) {
        super();
        this.mainController = mainController;
        this.addelement();
    }

    protected void addelement() {
        this.getChildren().clear();
        if (medicinainAcquisto != null){
            medicinainAcquisto.setPrefSize(30,20);
            System.out.println(medicinainAcquisto.getHeight());
            this.getChildren().add(medicinainAcquisto);

        }
        Button compra=new Button("Compra");
        compra.setOnAction(new CompraMedicina(mainController));
        this.getChildren().add(compra);
    }

    public Acquisto(MedicinainVetrina medicinainAcquisto, MainController mainController) {
        super();
        this.mainController= mainController;
        this.medicinainAcquisto = medicinainAcquisto;
        this.addelement();
    }

    public MedicinainVetrina getMedicinainAcquisto() {
        if (medicinainAcquisto==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION,"Nessuna Medicina Richiesta");
            alert.show();
        }
        return medicinainAcquisto;
    }

    public void setMedicinainAcquisto(MedicinainVetrina medicinainAcquisto) {
        this.medicinainAcquisto = medicinainAcquisto;
    }

    public void setMainController(MainController mainController) {
        this.mainController=mainController;
    }
}
