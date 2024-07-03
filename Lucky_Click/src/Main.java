import GUI.MainGui;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    //13:30
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene s = new Scene(new MainGui());
        primaryStage.setScene(s);
        primaryStage.show();
    }

}