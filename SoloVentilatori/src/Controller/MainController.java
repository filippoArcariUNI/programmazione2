package Controller;

import Models.Comparator.CompData;
import Models.Comparator.CompTipologia;
import Models.Fans;
import Models.Sito;
import Models.User;
import View.FansPane;
import View.MainView;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class MainController{
    Sito sito;
    User user;
    MainView mainView;

    public MainController(Sito sito, User user, MainView mainView) {
        this.sito = sito;
        this.user = user;
        this.mainView = mainView;
    }

    public ArrayList<FansPane> convertIntoFansPane(){
        ArrayList<FansPane> t = new ArrayList<>();
        this.sito.getVentilatori().forEach(fans -> {
            t.add(new FansPane(fans,this));
        });
        return t;
    }
    public void addAbbonamento(FansPane fan){
        this.user.getAbbonamenti().add(fan.getFans());
        this.user.setSpesaMensile(user.getSpesaMensile() + fan.getFans().getCosto());
        this.mainView.getHead().setSpesaMensile(user.getSpesaMensile());
        this.mainView.getHead().addElement();
        changeColor(fan);
    }
    private void changeColor(FansPane fansPane){
        fansPane.getCerchio().setStroke(Color.RED);
    }
    private void checkDisponibilita(){
        for (FansPane fansPane : this.mainView.getVetrina().getFansPanes()) {
            if (fansPane.getFans().getCosto()>= user.getCapitale()){
                fansPane.getCerchio().setFill(Color.GRAY);
            }else{
                fansPane.getCerchio().setFill(Color.BLUE);
            }
        }
    }
    public void nuovoMese(){
        this.user.setCapitale(user.getCapitale()-user.getSpesaMensile());
        this.mainView.getHead().setMesiTrascorsi(mainView.getHead().getMesiTrascorsi()+1);
        mainView.getHead().setCapitale(user.getCapitale());
        mainView.getHead().setSpesaMensile(user.getSpesaMensile());
        this.checkDisponibilita();
        this.mainView.getHead().addElement();
    }

    public void addFondi() {
        this.user.setCapitale(user.getCapitale()+100);
        this.mainView.getHead().setCapitale(user.getCapitale());
        this.checkDisponibilita();
        mainView.getHead().addElement();
    }
    public void ordinaPerTipologia(){
        this.sito.getVentilatori().sort(new CompTipologia());
        this.mainView.getVetrina().setFansPanes(convertIntoFansPane());
        this.mainView.getVetrina().redraw();
    }

    public void orinaPerData() {
        this.sito.getVentilatori().sort(new CompData());
        this.mainView.getVetrina().setFansPanes(convertIntoFansPane());
        this.mainView.getVetrina().redraw();
    }
}
