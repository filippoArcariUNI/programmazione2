package GUI;

import Model.Anime;
import Model.Enums.Lingue;
import Model.Film;
import Model.SerieTV;
import Model.Titolo;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class MainGUI extends BorderPane {
    private MainController mainController;
    private Head head;
    private Button btnClear;
    private TitoloInAcquisto titoloInAcquisto;
    private OrderButton orderButton;
    private ArrayList<Titolo> titolos;
    private ArrayList<TitoloPane> titoloPanes;
    private int index = 1;


    public MainGUI() {
        this.mainController = new MainController(this);
        titolos = new ArrayList<>();
        this.addTitoli();
        this.initialize();
    }
    protected void initialize(){
        this.getChildren().clear();
        titoloPanes = new ArrayList<>();
        this.convetIntoPanes();
        this.head = new Head(mainController,titoloPanes.subList(index-1,index+2));
        this.btnClear = new Button("Clear");
        btnClear.setOnAction((event -> mainController.clearAcquisto()));
        this.orderButton = new OrderButton(mainController);
        this.getChildren().add(new Text("ciao"));
        this.setTop(head);
        this.setRight(orderButton);
        this.setLeft(btnClear);
    }
    private void convetIntoPanes() {
        for (Titolo titolo : this.titolos) {
            titoloPanes.add(new TitoloPane(titolo,mainController));
        }
    }
    private void addTitoli() {
        this.titolos.add(new SerieTV("Boris",2010, Lingue.Italiano,10,4));
        this.titolos.add(new Anime("Attack on Titan",2013,Lingue.Giapponese,10,Lingue.Inglese));
        this.titolos.add(new Film("Parasite",2019,Lingue.Inglese,20));
        this.titolos.add(new Anime("Pokemon",2010,Lingue.Inglese,10));
        this.titolos.add(new Film("The Irishman",2019,Lingue.Inglese,5));
        this.titolos.add(new SerieTV("1994",2019,Lingue.Italiano,10,3));
        this.titolos.add(new Film("Her",2013,Lingue.Inglese,20));
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Head getHead() {
        return head;
    }

    public Button getBtnClear() {
        return btnClear;
    }

    public TitoloInAcquisto getTitoloInAcquisto() {
        return titoloInAcquisto;
    }

    public OrderButton getOrderButton() {
        return orderButton;
    }

    public ArrayList<Titolo> getTitolos() {
        return titolos;
    }

    public ArrayList<TitoloPane> getTitoloPanes() {
        return titoloPanes;
    }
}
