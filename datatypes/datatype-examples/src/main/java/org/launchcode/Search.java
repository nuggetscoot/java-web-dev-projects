package org.launchcode;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        // The first sentence of Alice’s Adventures in Wonderland
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        // Prompt the user for a search term
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a term to search for: ");
        String searchTerm = scanner.nextLine();

        // Perform a case-insensitive search
        boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());

        // Print whether or not the search term was found
        System.out.println("Search term \"" + searchTerm + "\" found: " + found);

        // If the search term is found, provide additional information
        if (found) {
            Integer index = aliceSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            Integer length = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

            // Replace the search term with an empty string in the sentence
            String modifiedSentence = aliceSentence.replace(searchTerm, "");
            System.out.println("Modified Sentence: " + modifiedSentence);
        }

        // Close the scanner
        scanner.close();
    }
}

