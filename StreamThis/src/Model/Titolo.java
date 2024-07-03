package Model;

import Model.Enums.Categoria;
import Model.Enums.Lingue;
import javafx.scene.paint.Color;

import java.awt.*;

public interface Titolo {
    public String getNome();
    public int getAnnoPubblicazione();
    public Categoria getCategoria();
    public Lingue getLingua();
    public int getPrezzo();
    public double getPrezzoScontato();
    public Color getColor();
    public  void setPrezzoScontato(double prezzoScontato);

}
