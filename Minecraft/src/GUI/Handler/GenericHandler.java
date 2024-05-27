package GUI.Handler;

import Data.BlockFactory;
import Data.Location;
import GUI.Controller.MainSimpleController;

import java.util.Random;

public abstract class GenericHandler {
    protected MainSimpleController mainSimpleController;
    protected GenericHandler(MainSimpleController msc){
        this.mainSimpleController=msc;
    }
    protected void addBlock(){
        Random rand = new Random();
        int x = rand.nextInt(Location.dimX);
        int z = rand.nextInt(Location.dimZ);
        mainSimpleController.randomBlock(new Location(z,x),new BlockFactory().randomBlock());
    }

}
