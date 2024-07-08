package main.java.service;


import main.java.service.operations.Addition;
import main.java.service.operations.Division;
import main.java.service.operations.Multiplication;
import main.java.service.operations.Subtraction;

public class Calculator {

    public double calculate(String operationType, double num1, double num2){
        double result = 0;
        switch (operationType){
            case "+":
                result = new Addition().execute(num1,num2);
                break;
            case "-":
                result = new Subtraction().execute(num1,num2);
                break;
            case "*":
                result = new Multiplication().execute(num1, num2);
                break;
            case "/":
                result = new Division().execute(num1,num2);
                break;
            default:
                System.out.println("Operação inválida");
        }
        return result;
    }

}
