package GUI;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Head extends VBox {
    public final int defalutTentativi = 10;
    MainController mainController;
    private int punteggio;
    private int tentativi;
    Text texTentativi;


    public Head(MainController mainController) {
        this.mainController = mainController;
        this.addElement();
    }

    protected void addElement() {
        this.getChildren().clear();
        Text txtPuntegio = new Text("Punteggio = " + this.punteggio);
        if (tentativi < defalutTentativi){
            texTentativi= new Text("Tentativi = " + this.tentativi);
        }else {
            texTentativi= new Text("GAME OVER!");

        }
        this.getChildren().add(txtPuntegio);
        this.getChildren().add(texTentativi);
        this.setAlignment(Pos.CENTER);

    }

    public int getPunteggio() {
        return punteggio;
    }

    public int getTentativi() {
        return tentativi;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public void setTentativi(int tentativi) {
        this.tentativi = tentativi;
    }

}

