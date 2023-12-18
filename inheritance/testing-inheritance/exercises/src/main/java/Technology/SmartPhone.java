package Technology;

public class SmartPhone extends Computer {
    public String ISP;

    // Constructor
    public SmartPhone(String brand, String model, int year, String ISP) {
        super(brand, model, year);
        this.ISP = ISP;
    }

    public void openApp(String appName) {
        System.out.println("Opening " + appName + ".");
    }

}
