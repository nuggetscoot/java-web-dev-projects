package org.launchcode;

public interface OpticalDisc {
   public static void spinDisc(){
        System.out.println("Disc is spinning");
    };
   public static void writeData(){
       System.out.println("Writing down data");
   };
    public static void readData() {
        System.out.println("Reading data");
    };

    public static void stopSpinning() {
        System.out.println("Disk has stopped spinning");

    };
}
