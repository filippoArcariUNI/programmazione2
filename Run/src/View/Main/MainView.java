package View.Main;

import Controller.MainController;
import Handlers.KeyHandler;
import View.Ostacoli.*;
import View.Player.Player;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.ObjectStreamClass;
import java.util.ArrayList;

public class MainView extends Pane {
    private MainController mainController;
    private ArrayList<AOstacolo> ostacoli;
    private Punteggio punteggio;
    private Player player;
    private Traguardo traguardo;


    public MainView(MainController mainController) {
        this.mainController =mainController;
        this.ostacoli = new ArrayList<>(6);
        this.addElement();
    }

    private void addElement() {
        for (int i = 0; i<6; i++) {

            if (i<3){
                AOstacolo penalty= new Penalty();
                this.ostacoli.add(penalty);
            }else{
                AOstacolo block = new Block();
                this.ostacoli.add(block);
            }
        }
        this.spawnObject();
    }
    public void spawnObject(){
        punteggio = new Punteggio(mainController);
        super.getChildren().add(punteggio);
        player = new Player();
        player.setLayoutY(player.getLocation().getY());
        player.setLayoutX(player.getLocation().getX());
        super.getChildren().add(player);
        traguardo = new Traguardo();
        this.ostacoli.add(traguardo);
        this.redrawOstacoli();
    }

    public ArrayList<AOstacolo> getOstacoli() {
        return ostacoli;
    }

    public void setOstacoli(ArrayList<AOstacolo> ostacoli) {
        this.ostacoli = ostacoli;
    }

    public Punteggio getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(Punteggio punteggio) {
        this.punteggio = punteggio;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Traguardo getTraguardo() {
        return traguardo;
    }

    public void setTraguardo(Traguardo traguardo) {
        this.traguardo = traguardo;
    }

    public void redrawOstacoli() {
        super.getChildren().removeIf(e -> (e instanceof Ostacolo) );
         for (AOstacolo ostacolo : this.ostacoli) {
             ostacolo.setLayoutY(ostacolo.getLocation().getY());
             ostacolo.setLayoutX(ostacolo.getLocation().getX());
             super.getChildren().add(ostacolo);
        }
    }
    public void redraw(){
        this.punteggio.addElement();
    }
}
