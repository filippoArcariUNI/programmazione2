package main;

import GUI.Controller.MainSimpleController;
import GUI.MainGUI;
import GUI.Model.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class  Main extends Application {
    @Override
    public void start(Stage primaryStage){

        Stage stage = new Stage();
        MainSimpleController mc = new MainSimpleController(new MainView());
        MainGUI layout = mc.getMg();
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

//        Lab 5  -> https://didatticaonline.unitn.it/dol/pluginfile.php/1810388/mod_resource/content/1/mc%235.txt
//        1.6
//
    }
    public static void main(String[] args) {
        launch(args);
    }

}
