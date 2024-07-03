package GUI;

import Model.BiColore;
import Model.Enums.Forme;
import Model.Enums.Materiali;
import Model.Normale;
import Model.Piastrella;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


import java.util.ArrayList;
import java.util.LinkedList;

public class MainController {
    private MainGUI mainGUI;
    private ArrayList<Piastrella> catalogo;
    private ArrayList<Color> coloriDisponibili;
    private int indexPiastrelle=0;


    public MainController(MainGUI mainGUI) {
        this.mainGUI = mainGUI;
        this.riempiColori();
        this.riempiCatalogo();
    }

    private void riempiColori() {
        this.coloriDisponibili = new ArrayList<>();
        coloriDisponibili.add(Color.BROWN);
        coloriDisponibili.add(Color.WHEAT);
        coloriDisponibili.add(Color.TEAL);
        coloriDisponibili.add(Color.DARKBLUE);
        coloriDisponibili.add(Color.OLIVE);
        coloriDisponibili.add(Color.GOLD);
    }
    private Color ciclaColori(int indexColori){
        if (indexColori >= coloriDisponibili.size()-1){
            indexColori=0;
        }else{
            indexColori++;
        }
        return coloriDisponibili.get(indexColori);
    }


    private void riempiCatalogo() {
        catalogo = new ArrayList<>();
        catalogo.add(new Normale(50, Materiali.ceramica,"P1",50,false,coloriDisponibili.getFirst()));
        catalogo.add(new Normale(20, Materiali.laminato,"P2",80,true,coloriDisponibili.getFirst()));
        catalogo.add(new Normale(50, Materiali.terracotta,"P3",40,true,coloriDisponibili.getFirst()));
        catalogo.add(new BiColore(100,Materiali.laminato,"B1",40,false,coloriDisponibili.getFirst(),coloriDisponibili.get(1), Forme.rettangolo));
        catalogo.add(new BiColore(120,Materiali.ceramica,"B2",90,true,coloriDisponibili.getFirst(),coloriDisponibili.get(1), Forme.cerchio));
        catalogo.add(new BiColore(140,Materiali.terracotta,"B3",50,true,coloriDisponibili.getFirst(),coloriDisponibili.get(1), Forme.rettangolo));
    }
    protected Piastrella getPiastrella(){
        return this.catalogo.getFirst();
    }
    protected void nextPiastrella(){
        this.indexPiastrelle++;
        this.cambiaPiastrella();
    }
    protected void prevPiastrella() {
        this.indexPiastrelle--;
        this.cambiaPiastrella();
    }
    private void cambiaPiastrella(){
        this.mainGUI.piastrellaPane.setPiastrella(this.catalogo.get(indexPiastrelle));
        this.mainGUI.wrapper.getDatiPiastrella().setPiastrella(this.catalogo.get(indexPiastrelle));
        this.mainGUI.redraw();
    }

    public int getIndexPiastrelle() {
        return indexPiastrelle;
    }

    public ArrayList<Piastrella> getCatalogo() {    
        return catalogo;
    }


    public void cambiaColore(Shape event) {
        Color colore = (Color) event.getFill();
        int coloreForma = coloriDisponibili.indexOf(colore);
        event.setFill(ciclaColori(coloreForma));
    }
}
