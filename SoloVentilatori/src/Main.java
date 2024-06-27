import Controller.MainController;
import Models.Sito;
import Models.User;
import View.MainView;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        MainView mv = new MainView();
        Scene s = new Scene(mv);
        primaryStage.setScene(s);
        primaryStage.show();
    }

}