package GUI;

import Model.Piastrella;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DatiPiastrella extends VBox {
    private MainController mainController;
    private Piastrella piastrella;
    private Text txtCod;
    private Text txtMateriale;
    private Text txtCosto;
    private Text txtDimensione;
    private Text txtScelta;

    public DatiPiastrella(MainController mainController, Piastrella piastrella) {
        this.mainController = mainController;
        this.piastrella = piastrella;
        this.redraw();
        this.setPadding(new Insets(5));
    }

    protected void redraw() {
        this.getChildren().clear();
        txtCod = new Text("Codice: " + piastrella.getCodice());
        txtCosto = new Text("Costo: "+ piastrella.getPrezzo());
        txtMateriale = new Text("Materiale: " +piastrella.getMateriale().toString());
        txtDimensione = new Text("Dimensione: " + piastrella.getLato());
        String testo = "Scelta colore: ";
        if (piastrella.isScelta()){
            testo+="SI";
        }else{
            testo+="NO";
        }
        txtScelta = new Text(testo);
        this.getChildren().addAll(txtCod,txtMateriale,txtCosto,txtDimensione,txtScelta);
    }

    public void setPiastrella(Piastrella piastrella) {
        this.piastrella = piastrella;
    }

}
