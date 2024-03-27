package Blocks;

public class AirBlock extends AbstractBlock{
    public AirBlock(){
        this.contenuto = '.';
        this.fall_through=true;
        this.falls_with_gravity=false;
    }


}
