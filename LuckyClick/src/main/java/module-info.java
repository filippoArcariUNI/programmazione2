module com.example.luckyclick {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    exports Main;
    opens Main to javafx.fxml;
}