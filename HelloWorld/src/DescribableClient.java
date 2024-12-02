// Code that uses the describable interface to define a method
public class DescribableClient {
    // I can define a method that works on ANY class
    // that supports the describable interface
    // Hard and unwieldy to do with subclassing
    public static void display(Describable d){
        String str = d.describeClass();
        System.out.println(str);
    }

    public static void main(String[] args) {
        DescribableTest d = new DescribableTest();
        display(d);
        AnotherDescribableClass d2 = new AnotherDescribableClass();
        display(d2);
    }
}
