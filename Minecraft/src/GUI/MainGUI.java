package GUI;

import Data.Blocks.NullBlock;
import GUI.Controller.MainSimpleController;
import Interface.MainView;
import javafx.scene.layout.BorderPane;

public class MainGUI extends BorderPane {
    private MapPane mappa;
    private ButtonListPane buttons;
    private FurnacePane furnace;
    private MainSimpleController mainController;

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
           this.mappa.setMaxWidth(300);
           this.buttons = new ButtonListPane(this);
           this.furnace = new FurnacePane(new NullBlock());
           this.mainController = new MainSimpleController(new MainView());
           super.setLeft(buttons);
           super.setCenter(mappa);
           super.setLeft(furnace);
        }
}
