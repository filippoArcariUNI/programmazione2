package GUI.Celle.CelleFIsiche;

import GUI.Celle.ACella;
import GUI.Celle.TipologieCelle;
import GUI.MainController;
import GUI.Utils.Location;
import javafx.scene.paint.Color;




public class Moltiplicatore extends ACella {
    public static int bonus =2;
    public Moltiplicatore(MainController mainController, Location location) {
        super("x"+ bonus, Color.GREEN, mainController, TipologieCelle.Motiplicatore,location);
    }
}
