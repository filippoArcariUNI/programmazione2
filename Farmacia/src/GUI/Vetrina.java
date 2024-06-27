package GUI;

import Model.Medicine.ConRicetta.NonRipetibile;
import Model.Medicine.ConRicetta.Ripetibile;
import Model.Medicine.DaBanco.DaBanco;
import Model.Medicine.Medicina;
import Model.Medicine.RealMedicina;
import com.sun.javafx.font.CharToGlyphMapper;
import javafx.scene.layout.VBox;
import java.util.Date;
import java.util.ArrayList;

public class Vetrina extends VBox {
    ArrayList<Medicina> vetrinas;
    MainController mainController;
    public Vetrina(MainController m){
        vetrinas=new ArrayList<>();
        this.mainController=m;
        this.addElement();
    }

    private void addElement() {
        Date oggi = new Date();
        Date ieri = Date.from(oggi.toInstant().minusSeconds(100000000));
        Date domani = Date.from(oggi.toInstant().plusSeconds(100000000));

        Medicina benagol = new RealMedicina(new DaBanco(domani,"Benagol"),domani,10,"Benagol");
        Medicina brufen200 = new RealMedicina(new DaBanco(domani,"Benagol"),domani,8,"Brufen200");
        Medicina brufen80 = new RealMedicina(new NonRipetibile(domani,"Brufen80"),domani,20,"Brufen80");
        Medicina oki = new RealMedicina(new Ripetibile(4,domani,"Oki"),domani,12,"Oki");
        Medicina Fluifort = new RealMedicina(new Ripetibile(2,ieri,"Fluifort"),ieri,18,"Fluifort");
        Medicina Tachipirina1000 = new RealMedicina(new Ripetibile(3,domani,"Tachipirina1000"),domani,6,"Tachipirina1000");
        vetrinas.add(benagol);
        vetrinas.add(brufen200);
        vetrinas.add(brufen80);
        vetrinas.add(oki);
        vetrinas.add(Fluifort);
        vetrinas.add(Tachipirina1000);
        this.insertElement();
    }

    private void insertElement() {
        this.getChildren().clear();
        for (Medicina medicina : this.vetrinas) {
            this.getChildren().add(new MedicinainVetrina(medicina,mainController));
        }
    }

    public void setMainController(MainController mainController) {
        this.mainController=mainController;
    }
}
