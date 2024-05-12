package GUI;

import Data.Blocks.NullBlock;
import javafx.scene.layout.BorderPane;

public class MainGUI extends BorderPane {
    private MapPane mappa;
    private ButtonListPane buttons;
    private FurnacePane furnace;

    public FurnacePane getFurnace() {
        return furnace;
    }

    public void setFurnace(FurnacePane furnace) {
        this.furnace = furnace;
    }

    public ButtonListPane getButtons() {
        return buttons;
    }

    public void setButtons(ButtonListPane buttons) {
        this.buttons = buttons;
    }

    public MapPane getMappa() {
        return this.mappa;
    }

    public void setMappa(MapPane mappa) {
        this.mappa = mappa;
    }


        public MainGUI(){
            super();
           this.mappa = new MapPane(false);
           this.buttons = new ButtonListPane(this);
           this.furnace = new FurnacePane(new NullBlock());
           super.setLeft(buttons);
           super.setCenter(mappa);
           super.setRight(furnace);
        }
}
