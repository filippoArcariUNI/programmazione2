package View.Ostacoli;

import Controller.MainController;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Shape;

import java.util.Date;
import java.util.Random;

public abstract class AOstacolo extends StackPane implements Ostacolo{
    TipiOstacoli tipo;
    Location location;


    public AOstacolo(TipiOstacoli tipo) {
        this.tipo = tipo;
        this.location = this.randomLocation();
    }

    public AOstacolo(TipiOstacoli tipo, Location location) {
        this.tipo = tipo;
        this.location = location;
    }

    private Location randomLocation(){
        Random random = new Random();
        return new Location(random.nextInt(Location.maxWidth),random.nextInt(Location.maxheigth));
    }

    @Override
    public Location getLocation() {
        return location;
    }
    public void move(){
      location.setX(location.getX()-10);
      this.setLayoutX(location.getX());
      this.setLayoutY(location.getY());
    }
}

