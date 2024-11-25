public class InstanceOfExamples {
    public static void main(String[] args) {
        // I can use an int in place of a double
        double x = 5;
        System.out.println(x);

        // Explicit cast
        double y = (double) 5;
        System.out.println(y);

        // Polymorphism, the square subclass is acting
        // as a Rectangle
        Rectangle r = new SquareSubClass(4);
        System.out.println(r);

        // Explicit casting square as a rectangle -> I'm allowed to cast
        // objects even as classes I've defined
        Rectangle r2 = (Rectangle) new SquareSubClass(4);
        System.out.println(r2);

        // Since Object is the superclass of everything, and
        // upcasting is always allowed, we can cast anything
        // to an Object
        String s = "Hello";
        Object o1 = s; //s is being cast immplicitly as Object
        System.out.println(o1);

        //Downcasting
        Rectangle r3 = new SquareSubClass(4); // Rectangle r3 was created using a square
        SquareSubClass s1 = (SquareSubClass) r3;  // Cast r3 back down into a square
        System.out.println(s1);

        // This produces an error because r4 was never a square at any point
        // So it can't be downcast
        /*
        Rectangle r4 = new Rectangle(3, 4);
        SquareSubClass s2 = (SquareSubClass) r4;
        System.out.println(s2);
         */

        Object o2 = "test"; // o2 is Object, "test" is a String, Object is superclass of String
                            // String->Object is upcasting, always allowed
        String s3 = (String) o2; // s3 is String, o2 is an Object, this is downcasting, but it is
                                 // allowed here because o2 was created using a String
        System.out.println(s3);

        /* THis code chunk throws an error
        Object o3 = 5; // upcasting from int to Object
        String s4 = (String) o3; // downcast into String, BUT o3 was created with an int, so
                                 // can't turn into String -> error
        System.out.println(s4);
         */

        Rectangle s5 = new SquareSubClass(6); //upcast square -> rectangle, but to call
                                                  // getSide I need a square
        SquareSubClass s6 = (SquareSubClass) s5; // downcast back into square to make getSide work
        System.out.println(s6.getSide()); //This line works

        // Using instanceof to check the classes of my object
        System.out.println(s5 instanceof SquareSubClass); // True, because s5 was created as square
        SquareSubClass s7 = new SquareSubClass(4);
        System.out.println(s7 instanceof Rectangle); //True also, as s5 is a rectangle

        // Creating a rectangle that was never a square and using instanceof
        Rectangle r7 = new Rectangle();
        System.out.println(r7 instanceof SquareSubClass); // false

        Car c = new Car(5, true);
        System.out.println(r7.equals(c));

    }
}
