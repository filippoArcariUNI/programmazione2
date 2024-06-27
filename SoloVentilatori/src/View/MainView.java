package View;

import Controller.MainController;
import Models.Sito;
import Models.User;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainView extends BorderPane {
    MainController mainController;
    Head head;
    Buttons buttons;
    Vetrina vetrina;
    Order orderButtons;

    public MainView() {
        super();
        this.mainController = new MainController(new Sito(),new User(),this);
        this.addContent();
    }

    private void addContent() {
        head =new Head(mainController);
        buttons = new Buttons(this.mainController);
        vetrina = new Vetrina(mainController);
        orderButtons =new Order(mainController);
        this.setTop(head);
        this.setLeft(buttons);
        this.setCenter(vetrina);
        this.setRight(orderButtons);
    }

    public Head getHead() {
        return head;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public Vetrina getVetrina() {
        return vetrina;
    }
}
