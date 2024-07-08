package service;

import service.operations.*;

public class Calculator {

    public static double calculate(TypeOperation typeOperation, double num1, double num2) {
        return switch (typeOperation) {
            case ADDITION -> new Addition().execute(num1, num2);
            case SUBTRACTION -> new Subtraction().execute(num1, num2);
            case MULTIPLICATION -> new Multiplication().execute(num1,num2);
            case DIVISION -> new Division().execute(num1, num2);
            case EXPONENTIATION -> new Exponentiation().execute(num1, num2);
            case LOGARITHM -> new Logarithm().execute(num1, num2);
            case SQUARE_ROOT -> new SquareRoot().execute(num1,Double.NaN);
        };
    }
}

