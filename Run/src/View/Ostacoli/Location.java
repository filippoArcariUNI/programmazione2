package View.Ostacoli;

public class Location {
    private int x;
    private int y;
    public static int maxWidth=500;
    public static int maxheigth=175;


    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
            this.y = y;
    }

    public void setX(int x) {
            this.x = x;
    }
}
