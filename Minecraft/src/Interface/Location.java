package Interface;

public class Location {
    private int z;
    private int x;
    public final static int dimX=16;
    public final static int dimZ=4;

    public Location(int row,int column){
        z=row;
        x=column;
    }

    public int  isX(){return  x;};
    public int isZ(){return  z;};

    protected boolean inBounds(){
        return (this.z >= 0 && this.z < dimZ && this.x >= 0 && this.x < dimX);
    }
}
