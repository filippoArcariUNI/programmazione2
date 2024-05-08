package main;
import Interface.*;
import Interface.Exteptions.WrongCoordinatesException;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("cia");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
       /* MainvView m= new MainvView();

        printStatus(m);
        m.display_on_out();
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Enter row and then column to pick that block");
            System.out.println("Enter '9' and the item number to move the item to the furnace");
            System.out.println("Enter '99' and then '9' to smelt");
            System.out.println("Enter '99' and then '0' to toggle the inventory sorting");
            System.out.println("Enter '99' and then any number to take from the furnace into the inventory");
            System.out.println("Enter '999' and 0 for insert a torch in a determined coords");

            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();
            int col = myObj.nextInt();
            if (row == 9){
                m.move_into_furnace_from_inventory(col);
            }else if( row == 99 ){
                if (col == 9) {
                    m.smelt();
                }else if (col == 0){
                    m.toggle_inventory_comparator();
                }else {
                    m.move_into_inventory_from_furnace();
                }
            } else {
                try{
                    Location c = new Location(row, col);
                    m.pick_up_block(c);
                }catch (WrongCoordinatesException e){
                    throw new RuntimeException(e);
                }
            }
            printStatus(m);
        }
    */
    }
    public static void printStatus(MainvView m){
        m.display_on_out();
        System.out.println("---- Furnace ----");
        m.displayFurnace();
        System.out.println("-----------------");
        System.out.println("--- Inventario --");
        m.displayInventory(); System.out.println();
        System.out.println("-----------------");
    }
}
