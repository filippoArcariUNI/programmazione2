package Model;

import Model.Enums.Forme;
import Model.Enums.Materiali;
import javafx.scene.paint.Color;

public class BiColore extends APiastrella{
    private Color coloreSecondario;
    private Forme forma;

    public BiColore(double prezzo, Materiali materiale, String codModello, int lato, boolean isScelta, Color colore, Color coloreSecondario,Forme forma) {
        super(prezzo, materiale, codModello, lato, isScelta, colore);
        this.coloreSecondario = coloreSecondario;
        this.forma = forma;
    }

    public Color getColoreSecondario() {
        return coloreSecondario;
    }

    public void setColoreSecondario(Color coloreSecondario) {
        this.coloreSecondario = coloreSecondario;
    }

    public Forme getForma() {
        return forma;
    }
}
