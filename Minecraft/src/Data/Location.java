package Data;

import Data.Exceptions.WrongCoordinatesException;

public class Location {
    private int z;
    private int x;
    public final static int dimX=6;
    public final static int dimZ=4;

    public Location(int row,int column){

        try {
            if (inBounds(row,column)){
                z=row;
                x=column;
            }
        } catch (WrongCoordinatesException e) {
            throw new RuntimeException(e);
        }
    }

    public int getX(){return  x;};
    public int getZ(){return  z;};

    private boolean inBounds(int rows,int column)throws WrongCoordinatesException {
        return (rows>= 0 && rows < dimZ && column >= 0 && column < dimX);
    }


}
