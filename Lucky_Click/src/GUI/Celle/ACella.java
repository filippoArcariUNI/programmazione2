package GUI.Celle;

import GUI.MainController;
import GUI.Utils.Location;
import Handelrs.CellaCliccata;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public abstract class ACella extends StackPane implements Cella{
    private final double lato = 50;
    private final Color coloreCoperta = Color.YELLOW;
    TipologieCelle tipologieCelle;
    protected String testo;
    Color color;
    boolean isCoperta=false;
    MainController mainController;
    private Rectangle copertura;
    private Location location;

    public ACella(String testo, Color color, MainController mainController,TipologieCelle tipologieCelle,Location location) {
        this.testo = testo;
        this.color = color;
        this.location = location;
        this.mainController = mainController;
        this.tipologieCelle  = tipologieCelle;
        this.addElement();
        this.addEventHandler(MouseEvent.MOUSE_CLICKED,new CellaCliccata(mainController,this));
    }

    protected void addElement() {
        this.getChildren().clear();
        Rectangle rectangle = new Rectangle(lato,lato);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(color);
        Text testoCella = new Text(this.testo);
        copertura = new Rectangle(lato,lato,coloreCoperta);
        if (this.tipologieCelle ==TipologieCelle.Base){
            this.getChildren().addAll(testoCella,rectangle,copertura);
        }else{
            this.getChildren().addAll(rectangle,testoCella,copertura);
        }
    }

    @Override
    public TipologieCelle getTipologia() {
        return this.tipologieCelle;
    }
    public void scopri(){
        this.getChildren().removeLast();
        this.setDisable(true);
        this.isCoperta=true;
    }

    @Override
    public String getTesto() {
        return this.testo;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public boolean isScoperta() {
        return this.isCoperta;
    }
}
