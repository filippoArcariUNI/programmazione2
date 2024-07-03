package GUI;

import Handlers.MoveToAcquisto;
import Model.Titolo;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class TitoloPane extends StackPane {
    private final  int height = 40;
    private final  int width = 130;
    MainController mainController;
    private Titolo titolo;

    public TitoloPane(Titolo titolo, MainController mainController) {
        super();
        this.mainController=mainController;
        this.titolo=titolo;
        Rectangle rectangle = new Rectangle(width,height,titolo.getColor());
        Text testo = new Text(titolo.getNome());
        super.getChildren().addAll(rectangle,testo);
        this.addEventHandler(MouseEvent.MOUSE_CLICKED,new MoveToAcquisto(mainController,this));
    }

    public Titolo getTitolo() {
        return titolo;
    }
}
