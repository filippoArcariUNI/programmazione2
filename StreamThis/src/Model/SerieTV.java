package Model;

import Model.Enums.Categoria;
import Model.Enums.Lingue;
import javafx.scene.paint.Color;

public class SerieTV extends ATitolo{
    private final Color color  = Color.MAGENTA;
    private int numStagioni;

    public SerieTV(String nome, int annoPubblicazione, Lingue lingua, int prezzo, int numStagioni) {
        super(nome, annoPubblicazione, Categoria.SerieTV, lingua, prezzo);
        this.numStagioni = numStagioni;
    }

    public Color getColor() {
        return color;
    }

    public int getNumStagioni() {
        return numStagioni;
    }
}
