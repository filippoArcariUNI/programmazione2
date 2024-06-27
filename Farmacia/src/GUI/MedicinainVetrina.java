    package GUI;

    import Model.Medicine.ConRicetta.Ricetta;
    import Model.Medicine.Medicina;
    import Model.Medicine.RealMedicina;
    import javafx.geometry.Insets;
    import javafx.scene.layout.HBox;
    import javafx.scene.layout.VBox;
    import javafx.scene.text.Text;

    import java.util.Date;

    public class MedicinainVetrina extends VBox {
        Medicina medicina;
        MainController mainController;

        public MedicinainVetrina(Medicina m, MainController mainController) {
            this.medicina=m;
            this.mainController=mainController;
            this.addElement();
            this.setPadding(new Insets(5,0,5,0));
            this.setPrefWidth(30);
            this.setPrefHeight(20);
        }

        protected void addElement() {
            Text txtNome = new Text(medicina.getNome());
            Text costo = new Text("Costo Base:"+medicina.getCosto() + " ,scontato:" + medicina.getCostoScontato());
            Text scad= new Text("Scadenza "+ medicina.getScadenza());
            Text tipologia = new Text(medicina.getRicetta().toString());
            this.getChildren().clear();
            this.getChildren().add(txtNome);
            this.getChildren().add(costo);
            this.getChildren().add(scad);
            this.getChildren().add(tipologia);
        }

        public Medicina getMedicina() {
            return medicina;
        }
    }
