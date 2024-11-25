public class SquareSubClass extends Rectangle{
    private double side;

    public SquareSubClass(double side) {
        super(side, side);
    }

    public String toString() {
        return String.format("Square of sidelength %.4f", side);
    }

    public static void main(String[] args) {
        SquareSubClass s = new SquareSubClass(3);
        System.out.println(s);
    }
}
