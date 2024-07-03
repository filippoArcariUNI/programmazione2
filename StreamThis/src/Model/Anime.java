package Model;

import Model.Enums.Categoria;
import Model.Enums.Lingue;
import javafx.scene.paint.Color;

public class Anime extends ATitolo{
    private Lingue sottotitoli;
    private final Color color  = Color.SALMON;

    public Anime(String nome, int annoPubblicazione,Lingue lingua, int prezzo, Lingue sottotitoli) {
        super(nome, annoPubblicazione, Categoria.Anime, lingua, prezzo);
        this.sottotitoli = sottotitoli;
    }

    public Anime(String nome, int annoPubblicazione, Lingue lingue, int prezzo) {
        super(nome, annoPubblicazione, Categoria.Anime, lingue, prezzo);
    }

    public Color getColor() {
        return color;
    }

    public Lingue getSottotitoli() {
        return sottotitoli;
    }
}
