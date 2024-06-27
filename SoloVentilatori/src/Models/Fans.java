package Models;

import Models.Enums.Marche;
import Models.TipologieFans.ATipologie;

public interface Fans {
    Marche getMarca();
    ATipologie getTipologia();
    int getCosto();
    String toString();
}
