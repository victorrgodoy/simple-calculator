package controller;

import service.Calculator;
import service.operations.TypeOperation;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            menu();
            String operation = scanner.nextLine().trim().toUpperCase();

            if (operation.equals("EXIT")) {
                System.out.println("Calculator terminated.");
                break;
            }

            try {
                TypeOperation typeOperation = TypeOperation.fromString(operation);
                double num1 = readNumber("Number 1");
                double num2 = 0; // Default value for operations requiring only one number

                if (typeOperation != TypeOperation.SQUARE_ROOT) {
                    num2 = readNumber("Number 2");
                }

                try {
                    double result = Calculator.calculate(typeOperation, num1, num2);
                    System.out.println("Result: " + result);
                    System.out.println(" ");
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid operation.");
                System.out.println();
            }
        }
        scanner.close();
    }

    private void menu() {
        System.out.println("##########################################");
        System.out.println("#                CALCULATOR              #");
        System.out.println("##########################################");
        System.out.println("#       Choose an operation:             #");
        System.out.println("#                                        #");
        System.out.println("#       ADDITION       ( + )             #");
        System.out.println("#       SUBTRACTION    ( - )             #");
        System.out.println("#       MULTIPLICATION ( * )             #");
        System.out.println("#       DIVISION       ( / )             #");
        System.out.println("#       EXPONENTIATION ( ^ )             #");
        System.out.println("#       LOGARITHM      ( log )           #");
        System.out.println("#       SQUARE_ROOT    ( sqrt )          #");
        System.out.println("#                                        #");
        System.out.println("# Type 'EXIT' to stop the calculator     #");
        System.out.println("##########################################");
        System.out.print("Enter operation: ");
    }

    private double readNumber(String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}

