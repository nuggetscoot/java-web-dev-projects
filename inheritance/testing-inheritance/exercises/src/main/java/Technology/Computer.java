package Technology;

public class Computer {
    public String brand;
    public String model;
    public int year;

    public Computer(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turning on the computer...");
    }

    public void turnOff() {
        System.out.println("Turning off the computer...");
    }
}
