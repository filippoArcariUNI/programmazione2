package Data;

import Data.Blocks.*;
import Data.Blocks.Interfaces.Block;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

public class BlockFactory {
    public RawIronBlock raw_iron_block(){
        return new RawIronBlock();
    }
    public SandBlock sand_block(){
        return new SandBlock();
    }

    public GlassBlock glass_block(){
        return new GlassBlock();
    }
    public AirBlock air_block(){
        return new AirBlock();
    }
//    public Furnace furnace(){
//        return new Furnace();
//    }
    public NullBlock null_block(){
        return new NullBlock();
    }

    public WaterBlock water(){
        return new WaterBlock();
    }

    public TorchBlock torchBlock(){return  new TorchBlock();}
    public Block randomBlock(){
        Method[] methods = this.getClass().getDeclaredMethods();
        Random random = new Random();
        ArrayList<Method> constructorMethods = new ArrayList<>();
        for (Method m : methods){
            if (!m.getName().equals("null_block")){
                constructorMethods.add(m);
            }
        }
        Method randomMethod = constructorMethods.get(random.nextInt(constructorMethods.size()));
        try {
            return (Block) randomMethod.invoke(this);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
