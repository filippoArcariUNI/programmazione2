package main;
import data.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map myMap=new Map();
        for (int i = 0; i < myMap.dimZ; i++) {
            System.out.print("Enter row: ");
            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();

            System.out.print("Enter column: ");
            int col = myObj.nextInt();

            System.out.println("Changing: "+row+" - "+col);
            myMap.change_cell(row,col);
        }
        myMap.display_on_out();
    }
}
