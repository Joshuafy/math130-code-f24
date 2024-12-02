public class DescribableTest implements Describable{
    // When I define the describeClass method here, that
    // fulfills the requirement from the Describable interface
    public String describeClass() {
        return "This is the Test class";
    }

    // Test method to equickly try out the class
    public static void main(String[] args) {
        DescribableTest d = new DescribableTest();
        System.out.println(d.describeClass());
    }
}
