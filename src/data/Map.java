package data;


public class Map {
    Block blocks[][];
    public int dimX=16;
    public int dimZ=16;

    public Map(){
        this.blocks=new Block[dimX][dimZ];
        for (int i=0; i<dimX;i++){
            for (int j=0;i<dimZ;j++){
                this.blocks[i][j]=new Block();
            }
        }
    }

    private void swap(int x, int z){
        if (--x>0 && --z>0){

        }

    }


    public void display_on_out(){
        for (int i=0; i<dimX;i++){
            for (int j=0;i<dimZ;j++){
                System.out.print(blocks[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void  change_cell(int i,int j){
        if (i<dimX && j<dimZ) {
            blocks[i][j] = new Block('A');
        }
    }
}
