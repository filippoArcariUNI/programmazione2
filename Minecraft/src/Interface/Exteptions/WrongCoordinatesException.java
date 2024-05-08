package Interface.Exteptions;

public class WrongCoordinatesException extends Exception{
    public WrongCoordinatesException(){
        System.out.println("Cords out of bound");
    }
}
