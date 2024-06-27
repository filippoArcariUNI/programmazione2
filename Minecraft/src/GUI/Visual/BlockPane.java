package GUI.Visual;

import Data.Blocks.*;
import Data.Blocks.Interfaces.Block;
import Data.Blocks.Interfaces.PickableBlocks;
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
        initialise();
    }

    public PickableBlocks getBlock() {
        return (PickableBlocks) block;
    }

    public void resettaDurezza(){
        this.durezza = ((PickableBlocks)this.block).getDurezza();
        initialise();
    }
    public BlockPane(Block b, int durezza) {
        super();
        this.block = b;
        this.durezza = durezza;
        this.initialise();
    }

    public void setDurezza(int durezza) {
        this.durezza = durezza;
        initialise();
    }

    public BlockPane(Block b) {
        super();
        this.block = b;
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
        if(this.block.isPickable()){
            super.setOpacity((double) this.durezza / ((PickableBlocks)this.block).getDurezza());
        }else{
            super.setOpacity(1);
        }
    }
    public void changeBlock(Block b){
        if (this.block != b){
            this.block = b;
            sfondo.setFill(this.colorSelector(this.block));
            testo.setText(b.getBlockName());
            if (b.isPickable()) {
                this.durezza = ((PickableBlocks) b).getDurezza();
            }
            initialise();
        }

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
            return Color.GREY;
        }

    }

    public int getDurezza() {return durezza;}
}
