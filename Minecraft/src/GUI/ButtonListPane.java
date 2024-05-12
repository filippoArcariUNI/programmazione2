package GUI;

import Data.BlockFactory;
import Data.Blocks.SandBlock;
import Interface.Location;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Random;

public class ButtonListPane extends VBox{
    private MainGUI mg;
    private Button btn;
    public ButtonListPane(MainGUI m){
        this.mg = m;
        testButton();
        randomButton();
        pick_up();
        smelt();
        move_back();
        inventory_sorting();
    }

    private void inventory_sorting() {
        Button btn = new Button("Toggle Inventory Sorting");
        super.getChildren().add(btn);
    }

    private void move_back() {
        Button btn = new Button("Move Back");
        super.getChildren().add(btn);
    }

    private void smelt() {
        Button btn = new Button("Smelt");
        super.getChildren().add(btn);
    }

    private void pick_up() {
        TextField inpt1 = new TextField("inpt1");
        TextField inpt2 = new TextField("inpt2");
        Button btn = new Button("Pick");
        HBox container = new HBox(inpt1,inpt2,btn);
        super.getChildren().add(container);


    }

    private void randomButton() {
        btn =new Button("Random Block");
        btn.setOnAction((e) -> {
            Random rand = new Random();
            int x = rand.nextInt(Location.dimX);
            int z = rand.nextInt(Location.dimZ);
            BlockPane block= (BlockPane) MapPane.getElementAt(mg.getMappa(),new Location(z,x));
            block.changeBlock(new BlockFactory().randomBlock());
        });
        super.getChildren().add(btn);
    }

    private void testButton(){
        btn = new Button();
        btn.setText("prova");
        btn.setOnAction(e->{
        MapPane mp= this.mg.getMappa();
        BlockPane selected = (BlockPane) MapPane.getElementAt(mp,new Location(0,0));
        selected.changeBlock(new SandBlock());
        });
        super.getChildren().add(btn);
    }
}
