package View;

import Controller.MainController;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class Head extends HBox {
    MainController mainController;
    int  capitale=100;
    int  spesaMensile;
    int mesiTrascorsi;

    public Head(MainController mainController) {
        super();
        this.mainController = mainController;
        this.addElement();
    }

    public void addElement() {
        this.getChildren().clear();
        Text txtCapitale = new Text("Capitale:" + capitale);
        Text txtSpesaMensile =new Text("SpesaMensile:" + spesaMensile);
        Text txtMesi = new Text("Mesi Trascorsi :" + mesiTrascorsi);
        this.getChildren().add(txtCapitale);
        this.getChildren().add(txtSpesaMensile);
        this.getChildren().add(txtMesi);
    }

    public int  getCapitale() {
        return capitale;
    }

    public void setCapitale(int capitale) {
        this.capitale = capitale;
    }

    public int  getSpesaMensile() {
        return spesaMensile;
    }

    public void setSpesaMensile(int spesaMensile) {
        this.spesaMensile = spesaMensile;
    }

    public int  getMesiTrascorsi() {
        return mesiTrascorsi;
    }

    public void setMesiTrascorsi(int  mesiTrascorsi) {
        this.mesiTrascorsi = mesiTrascorsi;
    }
}
