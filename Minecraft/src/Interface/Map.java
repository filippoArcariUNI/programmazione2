package Interface;
import Data.BlockFactory;
import Data.Blocks.*;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.SmeltableBlocks;


public class Map {
    private Block[][] blocks;
    BlockFactory bf =new BlockFactory();
    private final int dimZ=Location.dimZ;
    private final int dimX=Location.dimX;

    public Block getBlock(Location pos) {
        return blocks[pos.isZ()][pos.isX()];
    }


    public Map(){
        blocks=new Block[dimZ][dimX];
        for (int i = 0; i < dimZ; i++) {
            for (int j = 0; j < dimX; j++) {
                blocks[i][j]= bf.air_block();
            }
        }
        addRiver();
        fillMap();

    }
    private void fillMap(){
        for (int i = 0; i < dimZ; i++) {
            for (int j = 0; j < dimX; j++) {
                Block current;
                double defaultSelector = Math.random();
                if (defaultSelector < 0.40) {
                    current = bf.air_block();
                }else if (defaultSelector<= 0.90) {
                    current = bf.sand_block();
                }else{
                    current= bf.raw_iron_block();
                }
                insert_at_coords(new Location(0,j), current);
            }
        }
    }
    private void swap(Location pos){
        int z=pos.isZ();
        int x=pos.isX();
        if (pos.inBounds()&& z+1<dimZ){
            Block t=blocks[z][x];
            blocks[z][x]=blocks[z+1][x];
            blocks[z+1][x]=t;

        }
    }
    private void insert_iter(Location pos){
        int z=pos.isZ();
        int x=pos.isX();
        if (blocks[z][x].isFalls_with_gravity()) {
            while (z+1 < dimZ && blocks[z + 1][x].isFall_through() ) {
                swap(new Location(z,x));
                z++;
            }
        }
    }
    private void insert_rec(Location pos){
        int z=pos.isZ();
        int x=pos.isX();
        if (z<dimZ-1){
            if (!blocks[z+1][x].isFall_through()){
                return;
            }else{
                if (blocks[z][x].isFalls_with_gravity()){
                    swap(new Location(z,x));
                    insert_rec(new Location(z+1,x));
                }
            }
        }
    }
    public  void  addRiver(){
        addRowsOfWater(1);
    }
    public  void  addSea(){
        addRowsOfWater(3);
    }
    private  void  addRowsOfWater(int rowsOfWater){
        for (int i = 0; i < rowsOfWater; i++) {
            for (int j = 0; j < dimX; j++) {
                insert_at_coords(new Location(0,j),new WaterBlock());
            }

        }
    }
    public  void insert_at_coords(Location pos, Block b ){
        int z=pos.isZ();
        int x=pos.isX();
        blocks[z][x]=b;
        insert_iter(new Location(z,x));
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


    protected boolean isSmeltable(Location pos){
        int z=pos.isZ();
        int x=pos.isX();

        if(pos.inBounds()){
            return blocks[z][x] instanceof SmeltableBlocks;
        }else{
            return false;
        }
    }

    protected Block smelter(Location pos){
        int z=pos.isZ();
        int x=pos.isX();
        if(isSmeltable(pos)){
           return ((SmeltableBlocks)blocks[z][x]).smelt();
        }else{
            return new NullBlock();
        }
    }

}
