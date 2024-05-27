package Views;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StatsPane extends VBox {
    private int punteggio;
    private int tentativi;
    private boolean gameOver;

    private final Text txtPunteggio;
    private final Text txtTentativi;

    private final String TPunteggio = "Punteggio = ";
    private final String TTentativi = "Tentativi = ";
    private final String TGameOver = "Game Over";

    public StatsPane(){
        super();
        punteggio=0;
        tentativi=10;
        gameOver = false;
        txtPunteggio=new Text(TPunteggio + punteggio);
        txtTentativi=new Text(TTentativi + tentativi);
        txtTentativi.setFont(Font.font("arial"));
        txtPunteggio.setFont(Font.font("arial"));
        super.getChildren().addAll(txtTentativi,txtPunteggio);
    }

    public boolean isGameOver() {return gameOver;}

    public void setGameOver(boolean gameOver) {this.gameOver = gameOver;}

    public int getTentativi() {return tentativi;}

    public void decrementaTentativi() {
        if (tentativi > 1){
            this.tentativi--;
            this.txtTentativi.setText(TTentativi + this.tentativi);
        }else {
            txtTentativi.setText(TGameOver);
            gameOver= true;
        }
    }

    public int getPunteggio() {return punteggio;}

    public void setPunteggio(int p){
        this.punteggio=p;
        this.txtPunteggio.setText(TPunteggio);
    }
}
