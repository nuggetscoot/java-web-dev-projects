package Technology;

public class Laptop extends Computer{
    public double battery;

    public Laptop(String brand, String model, int year, double batteryLife) {
        super(brand, model, year);
        this.battery = battery;
    }

    public void shutDown() {
        System.out.println("Shutting down the laptop...");
    }
}
