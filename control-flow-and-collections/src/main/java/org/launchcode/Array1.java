package org.launchcode;

public class Array1 {
        public static void main(String[] args) {
            int[] numbers = {1, 1, 2, 3, 5, 8};
            System.out.println("All numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("\nOdd numbers:");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
