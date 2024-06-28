package View.Main;

import Controller.MainController;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class Punteggio extends HBox {
    private MainController mainController;
    private int punteggio;
    private int vite;
    private final  int numViteDafult=3;


    public Punteggio(MainController mainController) {
        this.mainController = mainController;
        this.vite=numViteDafult;
        this.addElement();
    }

    protected void addElement() {
        this.getChildren().clear();
        Text vite = new Text("Vite: " + this.vite);
        Text putneggio= new Text("punteggio: " + this.punteggio);
        this.getChildren().add(putneggio);
        this.getChildren().add(vite);
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getVite() {
        return vite;
    }

    public void setVite(int vite) {
        this.vite = vite;
    }
}
