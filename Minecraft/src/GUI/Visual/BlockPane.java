package GUI.Visual;

import Data.Blocks.*;
import Data.Blocks.AbstractClass.AbstractSolidBlock;
import Data.Blocks.Interfaces.Block;
import javafx.geometry.Pos;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class BlockPane extends StackPane {
    private Block block;
    private Rectangle sfondo;
    private Text testo;
    private int durezza;
    public static final int DIM_SQUARE = 50;
    private static final String FONT_NAME = "Verdana";
    private static final int FONT_SIZE = 18;
    private static final FontWeight FONT_WEIGHT = FontWeight.BOLD;
    private static final Color BLOCK_BORDER = Color.BLACK;
    private static final Color FONT_FILL = Color.BLACK;
    private static final Color FONT_BORDER = Color.BLACK;

    public void decreaseDurezza(){
        this.durezza-=1;
    }

    public Block getBlock() {
        return block;
    }

    public void resettaDurezza(){
        this.durezza = ((AbstractSolidBlock)this.block).getDurezza();
    }
    public BlockPane(Block b, int durezza) {
        super();
        this.block = b;
        this.durezza = durezza;
        this.initialise();
    }
    private void initialise(){
        super.getChildren().clear();
        sfondo = new Rectangle(DIM_SQUARE,DIM_SQUARE);
        testo = new Text(this.block.getBlockName());
        sfondo.setFill(this.colorSelector(this.block));
        sfondo.setStroke(BLOCK_BORDER);
        testo.setFont(Font.font(FONT_NAME, FONT_WEIGHT, FONT_SIZE));
        testo.setFill(FONT_FILL);
        testo.setStroke(FONT_BORDER);
        super.getChildren().addAll(sfondo,testo);
        super.setAlignment(Pos.CENTER);
        Tooltip t = new Tooltip(this.block.toString());
        Tooltip.install(this,t);
        super.setOpacity((double) durezza /((AbstractSolidBlock)this.block).getDurezza());
    }
    public void changeBlock(Block b){
        this.block = b;
        sfondo.setFill(this.colorSelector(this.block));
        testo.setText(b.getBlockName());
    }

    private Color colorSelector(Block b){
        if (b instanceof SandBlock) {
            return Color.BEIGE;
        }else if ( b instanceof AirBlock) {
            return Color.AZURE;
        }else if ( b instanceof IronSwordBlock) {
            return Color.LIGHTGRAY;
        } else if ( b instanceof RawIronBlock) {
            return Color.SILVER;
        } else if ( b instanceof TorchBlock) {
            return Color.ORANGE;
        } else if ( b instanceof WaterBlock) {
            return Color.LIGHTBLUE;
        }else if ( b instanceof GlassBlock) {
            return Color.ALICEBLUE;
        }else {
            return Color.BLACK;
        }

    }
}
