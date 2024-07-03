package GUI.Celle.CelleFIsiche;

import GUI.Celle.ACella;
import GUI.Celle.TipologieCelle;
import GUI.MainController;
import GUI.Utils.Location;
import javafx.scene.paint.Color;


import java.util.Random;

public class Base extends ACella {
    public Base(MainController mainController,Location location) {
        super(null, Color.WHITE, mainController, TipologieCelle.Base,location);
        this.setText();
    }

    private void setText() {
        Random random = new Random();
        this.testo = String.valueOf(random.nextInt(1,10)*100);
        super.addElement();
    }

}
