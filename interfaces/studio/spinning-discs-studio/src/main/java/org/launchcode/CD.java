package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

 @Override
 public void storeData(){
  System.out.println("Storing CD data");
 };

 public void readData() {
  System.out.println("Reading data");
 }
 @Override
 public void reportInfo() {
  System.out.println("Reporting CD info");
 }


 // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
