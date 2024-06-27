package Models;

import java.util.ArrayList;

public class User {
    private ArrayList<Fans> abbonamenti;
    private int capitale;
    private int spesaMensile;

    public User() {
        this.abbonamenti = new ArrayList<>();
        this.capitale=100;
    }

    public int getCapitale() {
        return capitale;
    }

    public ArrayList<Fans> getAbbonamenti() {
        return abbonamenti;
    }

    public void setCapitale(int capitale) {
        this.capitale = capitale;
    }
    public void calcolaSpesa(){
         this.spesaMensile= 0;
        for (Fans fans : this.abbonamenti) {
            this.spesaMensile+=fans.getCosto();
        }
    }

    public int getSpesaMensile() {
        return spesaMensile;
    }

    public void setSpesaMensile(int spesaMensile) {
        this.spesaMensile = spesaMensile;
    }
}
