package Model;

import Model.Enums.Materiali;
import javafx.scene.paint.Color;

public interface Piastrella {
    public String getCodice();
    public Materiali getMateriale();
    public double getPrezzo();
    public int getLato();
    public Color getColore();
    public boolean isScelta();
}
