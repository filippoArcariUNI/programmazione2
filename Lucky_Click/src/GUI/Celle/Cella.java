package GUI.Celle;

import GUI.Utils.Location;

public interface Cella {
    public TipologieCelle getTipologia();
    public void scopri();
    public String getTesto();
    public Location getLocation();
    public boolean isScoperta();
}
