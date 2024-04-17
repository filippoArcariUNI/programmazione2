package model.geralt;

import java.util.ArrayList;
import java.util.HashSet;

public class Geralt {
    private int forza=10;
    private int tolleranza = 2 ;

    private int velocita = 10 ;
    private int livello = 0;
    private HashSet<Spell> spell;
    private ArrayList<Mutation> mutations;
    public Geralt(){
        spell = new HashSet<>();
        mutations= new ArrayList<>();
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        if (forza >0){
            this.forza = forza;
        }
    }

    public int getTolleranza() {
        return tolleranza;
    }

    public void setTolleranza(int tolleranza) {
        this.tolleranza = tolleranza;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public void addSpell(Spell s){
        this.spell.add(s);
    }
    public void removeSpell(Spell s ){
        this.spell.remove(s);
    }
    public void addMutation(Mutation m){
        this.mutations.add(m);
    }
    public void removeMutation(Mutation m ){
        this.mutations.remove(m);
    }

    @Override
    public String toString() {
        return "Geralt{" +
                "\nforza=" + forza +
                "\n tolleranza=" + tolleranza +
                "\n velocita=" + velocita +
                "\n livello=" + livello +
                "\n spell=" + spell +
                "\n mutations=" + mutations +
                "\n}";
    }
}
