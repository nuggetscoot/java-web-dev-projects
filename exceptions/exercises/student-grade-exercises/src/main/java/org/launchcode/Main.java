package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            Divide(10, 2);  // Should print: Result of division: 5.0
            Divide(5, 0);   // Should print: Cannot divide by zero!
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Test out your CheckFileExtension() function!
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension(studentFiles.get(student));
                System.out.println(student + ": Points awarded: " + points);
            } catch (InvalidFileException e) {
                System.out.println(student + ": " + e.getMessage());
            }
        }
    }

    public static void Divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            double result = (double) x / y;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int CheckFileExtension(String fileName) throws InvalidFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileException("File name is null or empty. -1 points.");
        } else if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}

class InvalidFileException extends Exception {
    public InvalidFileException(String message) {
        super(message);
    }
}
