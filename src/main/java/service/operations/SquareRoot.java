package service.operations;

public class SquareRoot implements Operation {
    @Override
    public double execute(double num1, double ignored) {
        if (num1 < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(num1);
    }
}
