package GUI;

import Model.Anime;
import Model.Enums.Lingue;
import Model.Film;
import Model.SerieTV;
import Model.Sorting.Anno;
import Model.Sorting.Nome;
import Model.Sorting.Tipo;
import Model.Titolo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class MainController {
    MainGUI mainGUI;


    public MainController(MainGUI mainGUI) {
        this.mainGUI = mainGUI;

    }

    protected void increaseIndex(){
        if (mainGUI.getIndex() < mainGUI.getTitoloPanes().size()-2){
           mainGUI.setIndex(mainGUI.getIndex()+1);
           mainGUI.initialize();
            System.out.println(mainGUI.getIndex());
        }
    }
    protected void decreaseIndex(){
        if (mainGUI.getIndex() > 1){
            mainGUI.setIndex(mainGUI.getIndex()-1);
            mainGUI.initialize();

        }
    }

    public void acquisto(TitoloPane titoloPane){
        mainGUI.setCenter(new TitoloInAcquisto(titoloPane.getTitolo(),this));
    }

    public void clearAcquisto() {
      mainGUI.setCenter(null);

    }


    public void nomeOrder() {
        this.mainGUI.getTitolos().sort(new Nome());
        mainGUI.initialize();
    }

    public void annoOrder() {
        this.mainGUI.getTitolos().sort(new Anno());
        mainGUI.initialize();


    }

    public void tipoOrder() {
        this.mainGUI.getTitolos().sort(new Tipo());
        mainGUI.initialize();

    }
}
