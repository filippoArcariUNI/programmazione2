package Model.Celle;

import Controller.CellController;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public abstract class Cella extends StackPane{
    private boolean isCoperta;
    private String contenuto;
    private final int DIMENSIONE=50;
    protected final CellController cellController;
    private final Color coloreScoperta;

    public Cella(CellController cellController, Color coloreScoperta) {
        this.coloreScoperta = coloreScoperta;
        this.contenuto = contenuto;
        this.isCoperta = isCoperta;
        this.cellController = cellController;
        Rectangle r = new Rectangle(DIMENSIONE,DIMENSIONE);
        r.setFill(Color.YELLOW);
        r.setStroke(Color.BLACK);
        super.getChildren().add(r);
    }

    public boolean isCoperta() {return isCoperta;}

    public void setCoperta(boolean coperta) {isCoperta = coperta;}

    public String getContenuto() {return contenuto;}

    public void setContenuto(String s){
        this.contenuto=s;
    };

    public void scopri(Color color){
        if (isCoperta){
            super.getChildren().clear();
            Rectangle r = new Rectangle(this.DIMENSIONE,this.DIMENSIONE);
            r.setFill(this.coloreScoperta);
            r.setStroke(Color.BLACK);
            Text t = new Text(this.contenuto);
            super.getChildren().add(t);
            super.getChildren().add(r);
            this.isCoperta=false;
            attivaCella();
        }
    }
    public abstract void attivaCella();

    private void setSuperAction(Color coloreNascosto){
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            this.scopri(coloreNascosto);
        });
    }

}
