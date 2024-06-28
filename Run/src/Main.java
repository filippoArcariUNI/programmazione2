import Controller.MainController;
import Handlers.KeyHandler;
import View.Main.MainView;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(500);
        primaryStage.setHeight(200);
        MainController mainController = new MainController();
        MainView mainView = new MainView(mainController);
        Scene s = new Scene(mainView);
        mainController.setMainView(mainView);
        s.setOnKeyPressed(new KeyHandler(mainController));
        primaryStage.setScene(s);
        primaryStage.show();
    }

}