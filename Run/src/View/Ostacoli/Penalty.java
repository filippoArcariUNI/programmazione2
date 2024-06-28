package View.Ostacoli;

import Controller.MainController;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Penalty extends AOstacolo{
    private final int raggio = 10;
    private final Color color = Color.BLUE;
    private Circle circle;

    public Penalty() {
        super(TipiOstacoli.Penalty);
        this.create();
    }

    private void create() {
        circle= new Circle(raggio);
        circle.setFill(color);
        this.getChildren().add(circle);
    }

    public Circle getCircle() {
        return circle;
    }

    public Color getColor() {
        return color;
    }
}
