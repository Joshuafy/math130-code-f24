import java.util.ArrayList;

public class Square
                               // This implements the Comparable interface
                               // working only on Square types
{
    private double length;
    private double area;

    public Square(double iLength) {
        length = iLength;
        area = length * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double nLength) {
        length = nLength;
    }

    public double getArea() {
        return area;
    }

    // THis method has a parameter with same name as the length field
    public double newLength(double length) {
        // this.length refers to the field,
        // not the parameter length
        return this.length;
    }

    // if Comparable uses Object as its type, then EVERY compareTo
    // method has to work on object
    public int compareTo(Square s) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        return 0;
    }

}
