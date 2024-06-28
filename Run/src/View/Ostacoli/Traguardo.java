package View.Ostacoli;

import Controller.MainController;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Traguardo extends AOstacolo{
    private final int base= 10;
    private final int  altezza=200;
    private final Color color= Color.LIGHTBLUE;
    public Traguardo() {
        super(TipiOstacoli.Traguardo, new Location(Location.maxWidth,10));
        this.create();
    }

    private void create() {
        Rectangle rectangle = new Rectangle(base,altezza);
        rectangle.setFill(color);
        this.getChildren().add(rectangle);
    }


}
