package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

public void storeData() {
    System.out.println("Storing DVD data");
}
    public void readData() {
        System.out.println("Reading DVD data");
    }
    @Override
    public void reportInfo() {
        System.out.println("Reporting DVD info");
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
