package Model;

import Model.Enums.Categoria;
import Model.Enums.Lingue;
import javafx.scene.paint.Color;

public class Film extends ATitolo{
    private final Color color  = Color.CYAN;
    public Film(String nome, int annoPubblicazione, Lingue lingua, int prezzo) {
        super(nome, annoPubblicazione, Categoria.Film, lingua, prezzo);
    }

    public Color getColor() {
        return color;
    }
}
