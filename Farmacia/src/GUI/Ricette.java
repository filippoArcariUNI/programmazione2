package GUI;

import Handlers.SpostaSulBanco;
import Model.Medicine.ConRicetta.NonRipetibile;
import Model.Medicine.ConRicetta.Ricetta;
import Model.Medicine.ConRicetta.Ripetibile;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Date;

public class Ricette extends VBox{
    private MainController mainController;
    private ArrayList<Ricetta> ricette;

    public Ricette(MainController mainController) {
        this.mainController = mainController;
        ricette = new ArrayList<>();
        this.addElement();
    }
    private void addElement() {

        Date oggi = new Date();
        Date ieri = Date.from(oggi.toInstant().minusSeconds(100000000));
        Date domani = Date.from(oggi.toInstant().plusMillis(100000000));

        Ricetta brufen80 = new NonRipetibile(ieri,"Brufen80");
        Ricetta Fluifort = new Ripetibile(2,domani,"Fluifort");
        Ricetta Tachipirina1000 = new Ripetibile(3,domani,"Tachipirina1000");

        ricette.add(brufen80);
        ricette.add(Fluifort);
        ricette.add(Tachipirina1000);
        this.insertElement();
    }

    protected void insertElement() {
        this.getChildren().clear();
        for (Ricetta ricetta : this.ricette)
        {
            Button btnRicetta = new Button();
            String testo = "Ricetta per: " + ricetta.getNome();
            if(ricetta.getScadenza().before(new Date())){
                String s = "\n Valida fino al:" + ricetta.getScadenza().toString();
                testo =testo +s;
            }else{
                testo = testo +"\n(Scaduta)";
                btnRicetta.setDisable(true);
            }
            btnRicetta.setText(testo);
            btnRicetta.setOnAction(new SpostaSulBanco(mainController,ricetta));
            this.getChildren().add(btnRicetta);
        }


    }

    public ArrayList<Ricetta> getRicette() {
        return ricette;
    }

    public void setMainController(MainController mainController) {
        this.mainController=mainController;
    }
}
