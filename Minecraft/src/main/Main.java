package main;

import GUI.Controller.Simple.MainSimpleController;
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
//        FGMainController mc= new FGMainController(new MainView());
        MainGUI layout = mc.getMg();
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        //https://didatticaonline.unitn.it/dol/pluginfile.php/1810390/mod_resource/content/1/mc%237.txt
    }
    public static void main(String[] args) {
        launch(args);
    }

}
