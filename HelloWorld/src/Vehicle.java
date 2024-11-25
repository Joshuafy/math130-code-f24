public class Vehicle {
    private String brand;
    private String fuelType;
    private int wheelNumber;
    private String terrainType;

    // Takes in four params and sets fields to those parameter
    public Vehicle(String brand, String fuelType, int wheelNumber, String terrainType) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.wheelNumber = wheelNumber;
        this.terrainType = terrainType;
    }

    // in Vehicle class, getting into a crash pops off n wheels
    public void getIntoCrash(int n) {
        this.wheelNumber -= n;
    }

    public Vehicle() {

    }

    public int getWheelNumber() {
        return wheelNumber;
    }
    public String getBrand() {
        return brand;
    }
    public String getFuelType() {
        return fuelType;
    }
    public String getTerrainType() {
        return terrainType;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }
    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    private double randomNumber() {
        return 5.39;
    }
}
