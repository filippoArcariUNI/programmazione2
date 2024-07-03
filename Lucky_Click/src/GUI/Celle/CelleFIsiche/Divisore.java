package GUI.Celle.CelleFIsiche;

import GUI.Celle.ACella;
import GUI.Celle.TipologieCelle;
import GUI.MainController;
import GUI.Utils.Location;
import javafx.scene.paint.Color;


public class Divisore extends ACella {
    public static int malus = 2;
    public Divisore(MainController mainController, Location location) {
        super("/"+ malus, Color.RED, mainController, TipologieCelle.Divisore,location);
    }
}
