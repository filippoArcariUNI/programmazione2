package View.Player;

import Controller.MainController;
import View.Main.MainView;
import View.Ostacoli.Location;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

import java.awt.desktop.AboutEvent;

public class Player extends Group {
    private MainController mainController;
    Location location;
    Circle testa;
    Polygon polygon;
    public final double base=10;
    public final double h = 30;

    public Player() {
        this.location = new Location(10,Location.maxheigth/2);
        this.addElement();
    }

    private void addElement() {
        testa = new Circle(5);
        polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                0.0, 0.0,
                -this.base/2, this.h,
                this.base/2, this.h });
        polygon.setFill(Color.GREEN);
        this.getChildren().add(polygon);
        this.getChildren().add(testa);

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void moveUp() {
        this.location.setY(location.getY()-10);
        this.setLayoutY(location.getY());
    }
    public void moveDown(){
        this.location.setY(location.getY()+10);
        this.setLayoutY(location.getY());
    }

    public Circle getTesta() {
        return testa;
    }

    public Polygon getPolygon() {
        return polygon;
    }
}


