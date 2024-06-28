package Handlers;

import Controller.MainController;
import com.sun.javafx.animation.KeyValueType;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyHandler implements EventHandler<KeyEvent> {
    MainController mainController;

    public KeyHandler(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public void handle(KeyEvent event) {
        switch (event.getCode()){
            case SPACE -> mainController.moveObject();
            case UP -> {
                mainController.movePlayerUp();
                mainController.moveObject();
            }
            case DOWN -> {
                mainController.movePlayerDown();
                mainController.moveObject();
            }
        }
    }
}

