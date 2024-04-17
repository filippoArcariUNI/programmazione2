package Data.Blocks.AbstractClass;

import Data.Blocks.Interfaces.Block;

public abstract class AbstractBlock implements Block {
    protected char content;
    protected boolean falls_with_gravity;
    protected boolean fall_through;
    protected String blockName;

    public char isContent() {
        return this.content;
    }
    public boolean isFalls_with_gravity() {
        return this.falls_with_gravity;
    }
    public boolean isFall_through() {
        return this.fall_through;
    }
    public String toString(){
        return "\ncontenuto"+ this.content +"\nGravità " +this.falls_with_gravity + "\nAttraversa " +this.fall_through;
    }
}
