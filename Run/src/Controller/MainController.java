package Controller;

import View.Main.MainView;
import View.Ostacoli.AOstacolo;
import View.Ostacoli.Block;
import View.Ostacoli.Penalty;
import View.Ostacoli.Traguardo;
import View.Player.Player;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import javax.swing.*;

public class MainController{
    private MainView mainView;

    private final int INCREMENTOPUNT = 100;
    private final int DECREMENTOPUNT = 500;
    private final int PERDITAVITE = 1;



    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }
    private boolean checkIntersection(AOstacolo stackPane) {
        Bounds groupBounds = mainView.getPlayer().localToScene(mainView.getPlayer().getBoundsInLocal());
        Bounds stackPaneBounds = stackPane.localToScene(stackPane.getBoundsInLocal());
        return groupBounds.intersects(stackPaneBounds);
    }
    public void moveObject(){
        this.mainView.getPunteggio().setPunteggio(mainView.getPunteggio().getPunteggio()+INCREMENTOPUNT);
        for (int i = 0; i < this.mainView.getOstacoli().size(); i++) {
            AOstacolo aOstacolo = mainView.getOstacoli().get(i);
            aOstacolo.move();
            System.out.print("("+aOstacolo.getLocation().getX()+ "," + aOstacolo.getLocation().getY()+ ") ");
            if(this.checkIntersection(aOstacolo)){
                if(aOstacolo instanceof Penalty) {
                    ((Penalty) aOstacolo).getCircle().setFill(Color.TRANSPARENT);
                    ((Penalty) aOstacolo).getCircle().setStroke(((Penalty) aOstacolo).getColor());
                    this.mainView.getPunteggio().setPunteggio(mainView.getPunteggio().getPunteggio()-DECREMENTOPUNT);
                } else if (aOstacolo instanceof Block) {
                    ((Block) aOstacolo).getRectangle().setFill(Color.TRANSPARENT);
                    ((Block) aOstacolo).getRectangle().setStroke(((Block) aOstacolo).getColor());
                    this.mainView.getPunteggio().setVite(mainView.getPunteggio().getVite()-PERDITAVITE);
                    if (((Block) aOstacolo).getRectangle().getFill().equals(Color.TRANSPARENT)){
                        this.removeOstacolo(aOstacolo);
                    }
                    if (mainView.getPunteggio().getVite()<=0){
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Hai perso");
                        alert.show();

                    }
                    } else if (aOstacolo instanceof Traguardo){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Hai totalizzato " + mainView.getPunteggio().getPunteggio() + " punti");
                    alert.show();

                }
            }
            if (aOstacolo.getLocation().getX() <= 0){
                this.removeOstacolo(aOstacolo);
            }

        }
        System.out.println();
        mainView.redraw();
    }
    private void removeOstacolo(AOstacolo aOstacolo){
        this.mainView.getOstacoli().remove(aOstacolo);
        this.mainView.redrawOstacoli();
    }

    public void movePlayerUp() {
        this.mainView.getPlayer().moveUp();
    }

    public void movePlayerDown() {
        this.mainView.getPlayer().moveDown();

    }

}
