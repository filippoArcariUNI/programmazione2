package GUI;

import GUI.Celle.Cella;
import GUI.Celle.CelleFIsiche.Base;
import GUI.Celle.CelleFIsiche.Bomba;
import GUI.Celle.CelleFIsiche.Divisore;
import GUI.Celle.CelleFIsiche.Moltiplicatore;
import GUI.Utils.Location;
import javafx.scene.Node;
import javafx.scene.control.Cell;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Field extends GridPane{
    MainController mainController;
    ArrayList<Location> posizioni;
    private final int nCelleBomba=5;
    private final int nCelleMolt=10;
    private final int getnCelleDIv=10;
    public final static int cellePerLato = 10;

    public Field(MainController mainController) {
        this.mainController = mainController;
        this.addCelle();
    }

    private void addCelle() {
        this.selezionaPosizioni();
        assert this.posizioni != null;
        for (int i = 0; i < nCelleBomba; i++) {
            this.add(new Bomba(mainController,posizioni.getFirst()),posizioni.getFirst().getY(),posizioni.getFirst().getX());
            posizioni.removeFirst();
        }
        for (int i = 0; i < nCelleMolt; i++) {
            this.add(new Moltiplicatore(mainController,posizioni.getFirst()),posizioni.getFirst().getY(),posizioni.getFirst().getX());
            posizioni.removeFirst();
        }
        for (int i = 0; i < getnCelleDIv; i++) {
            this.add(new Divisore(mainController,posizioni.getFirst()),posizioni.getFirst().getY(),posizioni.getFirst().getX());
            posizioni.removeFirst();
        }
        for (Location location : this.posizioni) {
            this.add(new Base(mainController,location),location.getY(),location.getX());
        }
    }

    private void selezionaPosizioni() {
        posizioni= new ArrayList<>();
        for (int i = 0; i <cellePerLato*cellePerLato; i++) {
            Random x=new Random();
            Random y=new Random();
            Location temp;
            do {
                temp = new Location(x.nextInt(cellePerLato),y.nextInt(cellePerLato));
            }while (this.isPresente(temp));
            posizioni.add(temp);
            System.out.println(temp);
        }

    }

    private boolean isPresente(Location temp) {
        return posizioni.stream().anyMatch((e)-> e.getX() == temp.getX() && e.getY()==temp.getY());
    }

    public Cella getCella(Location l){
        for (Node child : this.getChildren()) {
            if(GridPane.getRowIndex(child)==l.getY() && GridPane.getColumnIndex(child)==l.getX()){
                return (Cella) child;
            }
        }
        return null;
    }

}
