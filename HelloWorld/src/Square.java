public class Square {
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
}
