package GUI.Model;
import Data.BlockFactory;
import Data.Blocks.*;
import Data.Blocks.BlockExteptions.BlockErrorException;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.DestroyedByTorch;
import Data.Blocks.Interfaces.SmeltableBlocks;
import Data.Exceptions.WrongCoordinatesException;
import Data.Location;


public class Map {
    private Block[][] blocks;
    BlockFactory bf =new BlockFactory();
    private final int dimZ= Location.dimZ;
    private final int dimX=Location.dimX;

    public Block getBlock(Location pos){
        return blocks[pos.getZ()][pos.getX()];
    }


    public Map(){
        blocks=new Block[dimZ][dimX];
        for (int i = 0; i < dimZ; i++) {
            for (int j = 0; j < dimX; j++) {
                blocks[i][j]= bf.air_block();
            }
        }
        fillMap();
        try {
            addRiver();
        } catch (WrongCoordinatesException e) {
            throw new RuntimeException(e);
        }

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
                try {
                    insert_at_coords(new Location(0,j), current);
                } catch (WrongCoordinatesException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    private void swap(Location pos){
        int z=pos.getZ();
        int x=pos.getX();
        if (z+1<dimZ){
            Block t=blocks[z][x];
            blocks[z][x]=blocks[z+1][x];
            blocks[z+1][x]=t;

        }

    }

    private void applyGravity(Location pos) throws WrongCoordinatesException {
        for (int i = pos.getZ(); i >0 ; i--) {
            Location upperLocation = new Location(i-1,pos.getX());
            if (getBlock(pos) instanceof DestroyedByTorch){
                insert_at_coords(upperLocation,new AirBlock());
            }
            if(getBlock(upperLocation).isFalls_with_gravity()){
                swap(upperLocation);
            }
        }
    }
    private void insert_iter(Location pos) throws WrongCoordinatesException{
        int z=pos.getZ();
        int x=pos.getX();
        if (getBlock(pos).isFalls_with_gravity()) {
            while (z+1 < dimZ && blocks[z + 1][x].isFall_through()) {
                swap(new Location(z,x));
                z++;
            }
        }
        applyGravity(pos);

    }
    private void insert_rec(Location pos) throws WrongCoordinatesException{
        int z=pos.getZ();
        int x=pos.getX();
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
    public  void  addRiver() throws WrongCoordinatesException{
        addRowsOfWater(1);
    }
    public  void  addSea() throws WrongCoordinatesException{
        addRowsOfWater(3);
    }
    private  void  addRowsOfWater(int rowsOfWater) throws WrongCoordinatesException{
        for (int i = 0; i < rowsOfWater; i++) {
            for (int j = 0; j < dimX; j++) {
                insert_at_coords(new Location(0,j),new WaterBlock());
            }
        }
    }
    public  void insert_at_coords(Location pos, Block b )throws WrongCoordinatesException{
        int z=pos.getZ();
        int x=pos.getX();
        blocks[z][x]=b;
        insert_iter(new Location(z,x));
    }

    private boolean isSmeltable(Location pos) throws WrongCoordinatesException{
        int z=pos.getZ();
        int x=pos.getX();
        return blocks[z][x] instanceof SmeltableBlocks;
    }

    protected Block smelter(Location pos) throws WrongCoordinatesException {
        int z=pos.getZ();
        int x=pos.getX();
        if(isSmeltable(pos)){
           return ((SmeltableBlocks)blocks[z][x]).smelt();
        }else{
            return new NullBlock();
        }
    }
    private boolean is_pickable(Location l)throws BlockErrorException{
        return getBlock(l).isPickable();
    }
    public Block gimme_pickable(Location l){
        try{
            if (is_pickable(l)){
                return getBlock(l);
            }
        }catch (BlockErrorException e) {
            System.out.println(e.toString());
        }
        return new NullBlock();
    }

}
