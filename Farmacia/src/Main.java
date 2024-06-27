import GUI.MainGUI;
import javafx.application.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        MainGUI mainGUI = new MainGUI();
        Scene s = new Scene(mainGUI);
        primaryStage.setScene(s);
        primaryStage.setWidth(750);
        primaryStage.setHeight(500);
        primaryStage.show();
    }

}