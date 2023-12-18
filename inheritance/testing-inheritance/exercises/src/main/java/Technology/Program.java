package Technology;
public class Program {
    public static void main(String[] args) {
        // Test Computer class
        Computer computer = new Computer("Dell", "XPS", 2020);
        computer.turnOn();
        System.out.println("Computer Brand: " + computer.brand);
        System.out.println("Computer Model: " + computer.model);
        System.out.println("Computer Year: " + computer.year);
        computer.turnOff();

        // Test Laptop class
        Laptop laptop = new Laptop("HP", "Pavilion", 2021, 8.0);
        laptop.turnOn();
        System.out.println("Laptop Brand: " + laptop.brand);
        System.out.println("Laptop Model: " + laptop.model);
        System.out.println("Laptop Year: " + laptop.year);
        System.out.println("Laptop Battery Life: " + laptop.battery + " hours");
        laptop.shutDown();

        // Test SmartPhone class
        SmartPhone phone = new SmartPhone("Samsung", "Galaxy S21", 2022, "Verizon");
        phone.turnOn();
        System.out.println("Phone Brand: " + phone.brand);
        System.out.println("Phone Model: " + phone.model);
        System.out.println("Phone Year: " + phone.year);
        System.out.println("Phone ISP: " + phone.ISP);
        phone.openApp("Maps");
        phone.turnOff();
}
}

