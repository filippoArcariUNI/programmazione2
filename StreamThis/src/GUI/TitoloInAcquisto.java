package GUI;

import Model.SerieTV;
import Model.Titolo;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class TitoloInAcquisto extends VBox{
    Titolo titolo;
    MainController mainController;
    private int stagioniAcquistate=0;
    private final double sconto = 0.25;
    private final double scontoTutte = 0.50;

    public TitoloInAcquisto(Titolo titolo,MainController mainController) {
        this.titolo = titolo;
        this.mainController = mainController;
        this.addElement();
    }

    protected void addElement() {
        this.getChildren().clear();
        this.setAlignment(Pos.CENTER);
        Text titolo = new Text(this.titolo.getNome());
        Text anno = new Text("Anno: "+ this.titolo.getAnnoPubblicazione());
        Text lingua = new Text("Lingua: "+ this.titolo.getLingua());
        Text prezzo = new Text("Prezzo Base: " + this.titolo.getPrezzo());
        Button btnPrezzo = new Button("Acquista " + this.titolo.getPrezzoScontato() + "€");
        super.getChildren().add(titolo);
        super.getChildren().add(anno);
        super.getChildren().add(lingua);
        super.getChildren().add(prezzo);
        if(this.titolo instanceof SerieTV){
            HBox hBox = new HBox();
            hBox.setAlignment(Pos.CENTER);
            int numStagioni = ((SerieTV) this.titolo).getNumStagioni();
            for (int i = 0; i < numStagioni; i++) {
                Button btnStagione = new Button("S"+(i));
                btnStagione.setOnAction((event -> {
                    this.stagioniAcquistate++;
                    if (stagioniAcquistate < numStagioni){
                        this.titolo.setPrezzoScontato((this.titolo.getPrezzo()*stagioniAcquistate)*(1-sconto));
                    } else if (stagioniAcquistate == numStagioni) {
                        this.titolo.setPrezzoScontato((this.titolo.getPrezzo()*stagioniAcquistate)*(1-scontoTutte));
                    }
                    btnPrezzo.setText("Acquista " + this.titolo.getPrezzoScontato() + "€");
                    btnStagione.setDisable(true);

                }));
                hBox.getChildren().add(btnStagione);
            }
            super.getChildren().add(hBox);
        }
        super.getChildren().add(btnPrezzo);
        btnPrezzo.setOnAction((event -> {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("ERRORE: connessione non presente.");
            alert.show();
        }));

    }
}
