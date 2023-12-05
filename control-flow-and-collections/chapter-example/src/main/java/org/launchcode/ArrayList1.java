package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbersList.add(i);
        }

        int sumOfEvens = sumOfEvenNumbers(numbersList);
        System.out.println("Sum of even numbers: " + sumOfEvens);

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("apple");
        wordsList.add("banana");
        wordsList.add("orange");
        wordsList.add("grape");
        wordsList.add("melon");
        wordsList.add("kiwi");
        wordsList.add("pear");
        wordsList.add("peach");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word length to search: ");
        int wordLength = scanner.nextInt();
        printWordsWithLength(wordsList, wordLength);
    }

    public static int sumOfEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printWordsWithLength(ArrayList<String> list, int length) {
        System.out.println("Words with length " + length + ":");
        for (String word : list) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
