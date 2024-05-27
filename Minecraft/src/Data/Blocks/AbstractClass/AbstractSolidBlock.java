package Data.Blocks.AbstractClass;

public abstract class AbstractSolidBlock extends AbstractBlock {
    public AbstractSolidBlock(){
        fall_through=false;
        falls_with_gravity=false;
        pickable=true;
    }
}
