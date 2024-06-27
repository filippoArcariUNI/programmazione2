package View;

import Controller.MainController;
import Handelrs.AddFanToUser;
import Models.Fans;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.awt.*;

public class FansPane extends HBox{
    Fans fans;
    Circle cerchio;

    public Circle getCerchio() {
        return cerchio;
    }

    public FansPane(Fans testo, MainController mainController) {
        this.fans=testo;
        cerchio = new Circle(20, Color.BLUE);
        cerchio.setStroke(Color.BLACK);
        cerchio.setStrokeWidth(5);
        Text txt = new Text(testo.toString());
        cerchio.addEventHandler(MouseEvent.MOUSE_CLICKED,new AddFanToUser(mainController,this));
        this.getChildren().addAll(cerchio,txt);
    }

    public Fans getFans() {
        return fans;
    }
}
