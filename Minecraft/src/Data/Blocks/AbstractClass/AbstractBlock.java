package Data.Blocks.AbstractClass;
import Data.Blocks.Interfaces.Block;

public abstract class AbstractBlock implements Block {
    protected char content;
    protected boolean falls_with_gravity;
    protected boolean fall_through;
    protected String blockName;
    protected int durezza;


    protected boolean pickable;


    public AbstractBlock(){
        pickable=false;
    }
    public char getContent() {
        return this.content;
    }
    public boolean isFalls_with_gravity() {
        return this.falls_with_gravity;
    }
    public boolean isFall_through() {
        return this.fall_through;
    }
    public boolean isPickable() {return pickable;}
    public int getDurezza(){return  durezza;};
    @Override
    public String getBlockName() {
        return this.blockName;
    }

    public String toString(){
        return "\ncontenuto"+ this.content +"\nGravità " +this.falls_with_gravity + "\nAttraversa " +this.fall_through;
    }
    @Override
    public String display_in_inventory() {
        return "[" + blockName + "]";
    }


}
