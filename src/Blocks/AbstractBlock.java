package Blocks;

public abstract class AbstractBlock implements Block{
    protected char contenuto;
    protected boolean falls_with_gravity;
    protected boolean fall_through;
    protected String  BlockName;

    public char isContent() {
        return this.contenuto;
    }
    public boolean isFalls_with_gravity() {
        return this.falls_with_gravity;
    }
    public boolean isFall_through() {
        return this.fall_through;
    }
    public String toString(){
        return "\ncontenuto"+ this.contenuto +"\nGravità " +this.falls_with_gravity + "\nAttraversa " +this.fall_through;
    }
}
