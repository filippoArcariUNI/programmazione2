package GUI;

import Data.Blocks.NullBlock;
import GUI.Controller.MainSimpleController;
import GUI.Visual.ButtonListPane;
import GUI.Visual.FurnacePane;
import GUI.Visual.InventoryPane;
import GUI.Visual.MapPane;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;

public class MainGUI extends BorderPane {
    private MapPane mappa;
    private ButtonListPane buttons;
    private FurnacePane furnace;
    private InventoryPane invetory;

    public InventoryPane getInvetory() {return invetory;}

    public FurnacePane getFurnace() {return furnace;}
    public ButtonListPane getButtons() {return buttons;}
    public MapPane getMappa() {return this.mappa;}


        public MainGUI(MainSimpleController msc){
           super();
           this.mappa = new MapPane(false);
           this.mappa.setMaxWidth(300);
           this.buttons = new ButtonListPane(this,msc);
           this.furnace = new FurnacePane(new NullBlock());
           this.invetory = new InventoryPane(msc.getMv().getMyInventory().getInventario());
           super.setLeft(buttons);
           BorderPane.setAlignment(buttons, Pos.BOTTOM_RIGHT);
           super.setCenter(mappa);
           super.setRight(furnace);
           super.setBottom(invetory);

        }
}
