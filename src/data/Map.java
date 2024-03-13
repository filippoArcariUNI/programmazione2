package data;

public class Map {
    char blocks[][];
    private int dimX=16;
    private int dimZ=16;

    public Map(){
        this.blocks=new char[dimX][dimZ];
    }

    public void display_on_out(){
        for (int i=0; i<dimX;i++){
            for (int j=0;i<dimZ;j++){
                System.out.print(blocks[i][j]);
            }
            System.out.print("\n");
        }
    }
}
