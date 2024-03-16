package data;

public class Block {
    private char contenuto;
    private boolean falls_with_gravity;
    private boolean fall_through;

    public Block(){
        this.contenuto = '.';
        this.fall_through=true;
        this.falls_with_gravity=false;
    }
    public Block(char c){
        this.contenuto=c;
        this.fall_through=false;
        this.falls_with_gravity=true;
    }
    public char display() {
        return this.contenuto;
    }
    public boolean isFalls_with_gravity() {
        return this.falls_with_gravity;
    }
    public boolean isFall_through() {
        return this.fall_through;
    }
}
