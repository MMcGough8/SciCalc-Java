package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        print (prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        print(prompt);
        while (!scanner.hasNextInt()) {
            print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        Integer result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static Double getDoubleInput(String prompt) {
        print(prompt);
        while (!scanner.hasNextDouble()) {
            print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        Double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }
}
