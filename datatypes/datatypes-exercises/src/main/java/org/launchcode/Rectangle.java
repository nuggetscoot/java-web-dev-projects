package org.launchcode;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;
       input = new Scanner(System.in);
        System.out.println("Please enter the length of a rectangle.");
        length = input.nextDouble();
        System.out.println("Please enter the width of a rectangle.");
        width = input.nextDouble();
        input.close();

        area = (length * width);
        System.out.println("The area of your rectangle is " + area);
    }

}
