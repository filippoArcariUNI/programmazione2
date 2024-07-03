package Model;

import Model.Enums.Materiali;
import javafx.scene.paint.Color;

public class Normale extends APiastrella{

    public Normale(double prezzo, Materiali materiale, String codModello, int lato, boolean isScelta, Color colore) {
        super(prezzo, materiale, codModello, lato, isScelta, colore);
    }
}
