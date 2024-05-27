package Controller;

import Views.CellePane;
import Views.StatsPane;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class CellController extends VBox{
    private final StatsPane statsPane;
    private final CellePane cellePane;

    public CellController() {
        this.statsPane = new StatsPane();
        this.cellePane = new CellePane(this);
        statsPane.setAlignment(Pos.CENTER);
        super.getChildren().add(cellePane);
        super.getChildren().add(statsPane);
    }

    public StatsPane getStatsPane() {
        return statsPane;
    }

    public CellePane getCellePane() {
        return cellePane;
    }
}
