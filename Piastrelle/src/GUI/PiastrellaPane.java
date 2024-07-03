package GUI;

import Model.BiColore;
import Model.Piastrella;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class PiastrellaPane extends StackPane {
    private final double lato = 130;
    private Piastrella piastrella;
    private MainController mainController;

    public PiastrellaPane(Piastrella piastrella,MainController mainController) {
        this.piastrella = piastrella;
        this.mainController =mainController;
        try {
            this.addElement();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void addElement() throws Exception {
        this.getChildren().clear();
        Rectangle rectangle = new Rectangle(lato,lato);
        rectangle.setFill(piastrella.getColore());
        if (piastrella.isScelta()){
            rectangle.addEventHandler(MouseEvent.MOUSE_CLICKED,(event -> mainController.cambiaColore(rectangle)));
        }
        this.getChildren().add(rectangle);
        Shape secondario;
        if(piastrella instanceof BiColore){
            switch (((BiColore)piastrella).getForma()){
                case cerchio -> secondario = new Circle(lato/2);
                case rettangolo -> secondario = new Rectangle(lato/2,lato/2);
                case null -> throw new Exception("Forma Secondaria non Inizializzata");
            }
            secondario.setFill(((BiColore)piastrella).getColoreSecondario());
            this.getChildren().add(secondario);
            if (piastrella.isScelta()){
                secondario.addEventHandler(MouseEvent.MOUSE_CLICKED,(event -> mainController.cambiaColore(secondario)));
            }
        }
    }

    public void setPiastrella(Piastrella piastrella) {
        this.piastrella = piastrella;
    }
}
