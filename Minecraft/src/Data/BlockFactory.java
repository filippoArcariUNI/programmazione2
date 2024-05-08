package Data;

import Data.Blocks.*;

import javax.swing.plaf.basic.BasicInternalFrameUI;

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
    public Furnace furnace(){
        return new Furnace();
    }
    public NullBlock null_block(){
        return new NullBlock();
    }

    public WaterBlock water(){
        return new WaterBlock();
    }

    public TorchBlock torchBlock(){return  new TorchBlock();}
}
