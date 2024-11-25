public class PolymorphismClient {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        System.out.println(r);

        SquareSubClass s = new SquareSubClass(3);
        System.out.println(s);

        // Declaration is allowed since r2 needs to be a Rectangle, and
        // SquareSubClass "is a" Rectangle.  BUT it will still use SquareSubClass
        // methods if that method was overriden by SquareSubClass (eg. toString)
        Rectangle r2 = new SquareSubClass(5);

        // Using superclass in place of subclass
        // doesn't work, as the superclass is not a subclass
        // a rectangle is not a square
        //SquareSubClass s2 = new Rectangle(4, 7)

        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = new Rectangle(6, 7);
        shapes[1] = new SquareSubClass(4);

        for (Rectangle shape : shapes) {
            System.out.println("Summary of shape: " + shape.toString());
        }
    }
}
