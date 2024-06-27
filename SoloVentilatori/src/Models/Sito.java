package Models;

import Models.Alimentazioni.Batteria;
import Models.Alimentazioni.Meccanici;
import Models.Alimentazioni.Presa;
import Models.Enums.Marche;
import Models.TipologieFans.PareteFans;
import Models.TipologieFans.PiantanaFans;
import Models.TipologieFans.SoffittoFans;

import java.util.ArrayList;

public class Sito {
    private ArrayList<Fans> ventilatori= new ArrayList<>();

    public Sito() {
        this.inizialize();
    }

    public ArrayList<Fans> getVentilatori() {
        return ventilatori;
    }

    private void inizialize() {
        RealFans f1 = new RealFans(Marche.Ariate,new PiantanaFans(),new Batteria());
        RealFans f2 = new RealFans(Marche.Bosch,new PareteFans(),new Presa());
        RealFans f3 = new RealFans(Marche.Bosch,new PareteFans(),new Meccanici());
        RealFans f4 = new RealFans(Marche.Bosch,new SoffittoFans(),new Batteria());
        RealFans f5 = new RealFans(Marche.Parkside,new SoffittoFans(),new Presa());
        ventilatori.add(f1);
        ventilatori.add(f2);
        ventilatori.add(f3);
        ventilatori.add(f4);
        ventilatori.add(f5);
    }
}
