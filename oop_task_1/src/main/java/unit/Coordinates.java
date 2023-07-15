package unit;

public class Coordinates {
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double calcDistance (Coordinates point ) {
        int dx = point.x - x;
        int dy = point.y - y;
        return Math.sqrt((dx*dx) + (dy*dy));


    }
    int x;
    int y;



}
