package Interface;
import Blocks.*;

public class Map {
    private Block blocks[][];
    final static int dimX=16;
    final static int dimZ=4;


    public Block getBlock(int z, int x) {
        return blocks[z][x];
    }

    public int isDimX(){
        return dimX;
    }
    public int isDimZ(){
        return dimZ;
    }

    public Map(){
        blocks=new Block[dimZ][dimX];
        for (int i = 0; i < dimX*dimZ; i++) {
            int defaultSelector=(int)(Math.random()*10)%2;
            int z=(int) (Math.random()*100)%dimZ;
            int x=(int) (Math.random()*100)%dimX;
            Block current;
            if (defaultSelector==0){
                current=new AirBlock();
            }else{
                current=new SandBlock();
            }
            insert_at_coords(z,x,current);
        }
    }

    private void swap(int z, int x){
        if ((z>=0) && (x<dimX && z+1<dimZ)){
            Block t=blocks[z][x];
            blocks[z][x]=blocks[z+1][x];
            blocks[z+1][x]=t;

        }
    }
    private void insert_iter(int z, int x){
        if (blocks[z][x].isFalls_with_gravity()) {
            while (z+1 < dimZ &&  blocks[z + 1][x]!=null && blocks[z + 1][x].isFall_through() ) {
                swap(z,x);
                z++;
            }
        }
    }
    private void insert_rec(int z, int x){
        if (z<dimZ-1){
            if (!blocks[z+1][x].isFall_through()){
                return;
            }else{
                if (blocks[z][x].isFalls_with_gravity()){
                    swap(z,x);
                    insert_rec(z+1,x);
                }
            }
        }
    }

    public  void insert_at_coords(int z, int x, Block b ){
        blocks[z][x]=b;
        insert_iter(z,x);
    }

    public void display_on_out(){
        for (int i=0; i<dimZ;i++){
            for (int j=0;j<dimX;j++){
                char ciao = blocks[i][j].isContent();
                System.out.print(ciao);
            }
            System.out.print("\n");
        }
    }

}
