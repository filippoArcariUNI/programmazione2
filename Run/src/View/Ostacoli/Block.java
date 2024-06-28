package View.Ostacoli;

import Controller.MainController;
import com.sun.tools.javac.Main;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Block extends AOstacolo{

    private final int dimensione = 20;
    private final Color  color = Color.RED;
    private Rectangle rectangle;

    public Block() {
        super(TipiOstacoli.Block);
        this.create();
    }


    public Rectangle getRectangle() {
        return rectangle;
    }

    private void create() {
        rectangle = new Rectangle(dimensione,dimensione);
        rectangle.minHeight(dimensione);
        rectangle.minWidth(dimensione);
        rectangle.setFill(color);
        this.getChildren().add(rectangle);
    }

    public Color getColor() {
        return color;
    }
}
