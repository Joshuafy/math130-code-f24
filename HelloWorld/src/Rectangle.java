public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Default constructor; doesn't do anything
    public Rectangle() {

    }

    public String toString() {
        // String.format returns a string, doesn't print the string
        return String.format("Length is %.4f, width is %.4f", length, width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);

        // If no toString method, get memory address
        System.out.println(r);
    }
}
