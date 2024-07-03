package GUI.Celle.CelleFIsiche;

import GUI.Celle.ACella;
import GUI.Celle.TipologieCelle;
import GUI.MainController;
import GUI.Utils.Location;
import javafx.scene.paint.Color;

import java.awt.*;

public class Bomba extends ACella {
    public Bomba(MainController mainController, Location location) {
        super("BOOM!", Color.BLUE, mainController, TipologieCelle.Bomba,location);
    }
}
