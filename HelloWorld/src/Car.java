public class Car extends Vehicle {
    // This tells Java that a Car is a subclass of Vehicle
    private double mileage;
    private boolean isAutonomous;

    public Car(double mileage, boolean isAutonomous) {
        this.mileage = mileage;
        this.isAutonomous = isAutonomous;
    }

    // Define a constructor that takes in all the vehicle params
    public Car(String brand, String fuelType, int wheelNumber, String terrainType,
               double mileage, boolean isAutonomous) {
        // invoke the superclass constructor to set the first four fields:
        super(brand, fuelType, wheelNumber, terrainType);

        this.isAutonomous = isAutonomous;
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public double getMileage() {
        return mileage;
    }
    public boolean getIsAutonomous() {
        return isAutonomous;
    }

    // Try to implement a method that takes in a parameter m
    // (miles, double) and increases (+) the car's mileage by 2 *m
    // if the car's terrain is water, m if the car's terrain
    // is land and .5 * m if the car's terrain is air.
    public void setNewMileage(double m) {
        if (this.getTerrainType().equals("water")) {
            mileage = mileage + 2 * m;
        } else if (this.getTerrainType().equals("land")) {
            mileage = mileage + m;
        } else {
            mileage = mileage + .5 * m;
        }
    }


    // This method reduces the wheelnumber by twice n
    public void getIntoCrash(int n) {
        setWheelNumber(this.getWheelNumber() - 2 * n);
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Hydrogen", 5, "water",
                200000, false);

        System.out.println(c.getWheelNumber());
        c.getIntoCrash(3);
        System.out.println(c.getWheelNumber());
    }
}
