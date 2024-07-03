import GUI.MainGUI;
import GUI.TitoloPane;
import Model.Anime;
import Model.Enums.Lingue;
import Model.Film;
import Model.SerieTV;
import Model.Titolo;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    private final  int width = 400;
    private final  int height = 250;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        MainGUI m = new MainGUI();
        m.setMinHeight(height);
        m.setMinWidth(width);
        Scene s = new Scene(m);
        primaryStage.setScene(s);
        primaryStage.setHeight(height);
        primaryStage.setWidth(width);
        primaryStage.show();
    }

}