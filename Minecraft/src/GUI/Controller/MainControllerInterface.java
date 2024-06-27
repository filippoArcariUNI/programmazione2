package GUI.Controller;

import Data.Blocks.Interfaces.Block;
import Data.Location;
import GUI.MainGUI;
import GUI.Model.MainView;

public interface MainControllerInterface{
    public void smelt();
    public void move_into_inventory_inpt_furnace();
    public void move_into_inventory_out_furnace();
    public void move_into_furnace_from_inventory(int index);
    public void pick_up_block(Location l);
    public void toggle_inventory_comparator(boolean selector);
    public void randomBlock(Location l , Block b);
    public void mineBlock(Location l);
    public MainView getMv();
    MainGUI getMg();
}
