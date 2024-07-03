package GUI;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class MainGUI extends HBox {
    MainController mainController;
    Wrapper wrapper;
    PiastrellaPane piastrellaPane;

    public MainGUI() {
        mainController= new MainController(this);
        piastrellaPane= new PiastrellaPane(mainController.getPiastrella(),mainController);
        wrapper = new Wrapper(mainController);
        this.getChildren().addAll(wrapper,piastrellaPane);
        this.setPadding(new Insets(10));
    }


    public void redraw(){
        this.wrapper.getDatiPiastrella().redraw();
        try {
            this.piastrellaPane.addElement();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
