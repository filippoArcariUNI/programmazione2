package data;

public class Block {
    private char contenuto;

    public Block(){
        this.contenuto = '.';
    }
    public Block(char c){
        this.contenuto=c;
    }
    public char display(){
        return contenuto;
    }
}
