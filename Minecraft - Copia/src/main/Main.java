package main;

import Data.BlockFactory;
import Data.Blocks.Interfaces.Block;
import GUI.InventoryPane;
import GUI.MainGUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class  Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {



        BlockFactory bf = new BlockFactory();
        MainGUI mainGUI = new MainGUI();
        ArrayList<Block> inventarioTemp = new ArrayList<>();
        inventarioTemp.add(bf.glass_block());
        inventarioTemp.add(bf.sand_block());
        inventarioTemp.add(bf.raw_iron_block());
        InventoryPane inventario = new InventoryPane(inventarioTemp);

        BorderPane layout = new BorderPane();
        layout.setMinHeight(500);
        layout.setMinWidth(500);

        layout.getChildren().add(mainGUI);
        layout.setBottom(inventario);

        Scene visualization = new Scene(layout);
        Stage window = new Stage();
        window.setScene(visualization);
        window.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}
