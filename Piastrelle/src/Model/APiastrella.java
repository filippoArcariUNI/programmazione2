package Model;

import Model.Enums.Materiali;
import javafx.scene.paint.Color;

import java.awt.*;

public abstract class APiastrella implements Piastrella{
    private double prezzo;
    private Materiali materiale;
    private String codModello;
    private int lato;
    private boolean isScelta;
    private Color colore;

    public APiastrella(double prezzo, Materiali materiale, String codModello, int lato, boolean isScelta, Color colore) {
        this.prezzo = prezzo;
        this.materiale = materiale;
        this.codModello = codModello;
        this.lato = lato;
        this.isScelta = isScelta;
        this.colore = colore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public Materiali getMateriale() {
        return materiale;
    }

    public String getCodice() {
        return codModello;
    }

    @Override
    public int getLato() {
        return lato;
    }

    public String getCodModello() {
        return codModello;
    }

    public boolean isScelta() {
        return isScelta;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    @Override
    public Color getColore() {
        return colore;
    }

}
