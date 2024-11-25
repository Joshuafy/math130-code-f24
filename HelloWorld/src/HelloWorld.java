import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        // Car(double mileage, boolean isAutonomous)
        Car c = (Car) new Vehicle("Brand", "diesal", 3, "water");

        System.out.println(c.getMileage());
        System.out.println(c.getIsAutonomous());
        System.out.println(c.getWheelNumber());


    }
}