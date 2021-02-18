package Practicum3.B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        xPositie = x;
        yPositie = y;
        if (rad>0) {
            radius = rad;
        } else {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }


    public String toString() {
        String s = "cirkel" + "(" + xPositie + ", " + yPositie + ")" + "met radius: " + radius;
        return s;
    }
}
