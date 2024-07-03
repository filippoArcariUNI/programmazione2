import GUI.MainGUI;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    private final int width = 300;
    private final int heigth= 180;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene s = new Scene(new MainGUI());
        primaryStage.setScene(s);
        primaryStage.setWidth(width);
        primaryStage.setHeight(heigth);
        primaryStage.show();
    }

}