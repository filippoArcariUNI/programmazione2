package GUI.Visual;

import Data.BlockFactory;
import Data.Blocks.SandBlock;
import GUI.Controller.MainSimpleController;
import GUI.MainGUI;
import Data.Location;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Random;

public class ButtonListPane extends VBox{
    private MainGUI mg;
    private Button btn;
    private boolean switchInventorySorting=true;
    MainSimpleController controllerMain;
    public ButtonListPane(MainGUI m, MainSimpleController msc){
        this.mg = m;
        this.controllerMain = msc;
        testButton();
        randomButton();
        pick_up();
        smelt();
        move_into_furnace();
        move_back();
        inventory_sorting();
    }

    private void move_into_furnace() {
        Button btn = new Button("Move into Furnace");
        btn.setOnAction(event -> this.controllerMain.move_into_furnace_from_inventory());
        super.getChildren().add(btn);
    }

    private void inventory_sorting() {
        Button btn = new Button("Toggle Inventory Sorting");
        btn.setOnAction((event -> {
            if (this.switchInventorySorting){
                this.controllerMain.toggle_inventory_comparator(true);
                this.switchInventorySorting = !switchInventorySorting;
            }else{
                this.controllerMain.toggle_inventory_comparator(false);
                this.switchInventorySorting = !switchInventorySorting;
            }
        }));
        super.getChildren().add(btn);
    }

    private void move_back() {
        Button btn = new Button("Move Back");
        btn.setOnAction((event -> this.controllerMain.move_into_inventory_from_furnace()));
        super.getChildren().add(btn);
    }

    private void smelt() {
        Button btn = new Button("Smelt");
        btn.setOnAction((event -> {
            controllerMain.smelt();
        }));
        super.getChildren().add(btn);
    }

    private void pick_up() {
        Spinner<Integer> inpt1 = new Spinner<>(0,Location.dimZ,0);
        Spinner<Integer> inpt2 = new Spinner<>(0,Location.dimX,0);
        Button btn = new Button("Pick");
        HBox container = new HBox(inpt1,inpt2,btn);
        super.getChildren().add(container);
        btn.setOnAction(event -> {
            controllerMain.pick_up_block(new Location(inpt1.getValue(),inpt2.getValue()));
        });
    }

    private void randomButton() {
        btn =new Button("Random Block");
        btn.setOnAction((e) -> {
            Random rand = new Random();
            int x = rand.nextInt(Location.dimX);
            int z = rand.nextInt(Location.dimZ);
            controllerMain.randomBlock(new Location(z,x),new BlockFactory().randomBlock());
        });
        super.getChildren().add(btn);
    }

    private void testButton(){
        btn = new Button();
        btn.setText("prova");
        btn.setOnAction(e->{
        MapPane mp= this.mg.getMappa();
        BlockPane selected = (BlockPane) MapPane.getElementAt(mp,new Location(0,0));
            assert selected != null;
            selected.changeBlock(new SandBlock());
        });

        super.getChildren().add(btn);
    }
}
