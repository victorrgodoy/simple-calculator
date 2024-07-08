package main.java.controller;

import main.java.service.Calculator;

import java.util.Scanner;

public class UserInterface {
    private final Calculator calculator;
    private final Scanner scanner;

    public UserInterface(Scanner scanner){
        this.calculator = new Calculator();
        this.scanner = scanner;
    }

    public void start(){

        while (true){
            menu();
            String operation = scanner.nextLine().trim().toLowerCase();

            if (operation.equals("exit")){
                System.out.println("Calculator terminated.");
                break;
            }

            if (isValidOperation(operation)){
                double num1 = readNumber("Number 1");
                double num2 = readNumber("Number 2");

                try {
                    long result = (long) calculator.calculate(operation, num1,num2);
                    System.out.println("Result: " + result);
                    System.out.println(" ");
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Operação inválida.");
                System.out.println();
            }
        }
        scanner.close();
    }

    private void menu(){
        System.out.println("##########################################");
        System.out.println("#                CALCULATOR              #");
        System.out.println("##########################################");
        System.out.println("# Choose an operation:                   #");
        System.out.println("#                                        #");
        System.out.println("#       +   (Addition)                   #");
        System.out.println("#       -   (Subtraction)                #");
        System.out.println("#       *   (Multiplication)             #");
        System.out.println("#       /   (Division)                   #");
        System.out.println("#                                        #");
        System.out.println("# Type 'EXIT' to stop the calculator     #");
        System.out.println("##########################################");
        System.out.print("Enter operation: ");
    }

    private boolean isValidOperation(String operation){
        return operation.equals("+") || operation.equals("-") ||
               operation.equals("*") || operation.equals("/");
    }

    private double readNumber(String number){
        while (true) {
            System.out.print(number + ": ");
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number");
            }
        }
    }

}
