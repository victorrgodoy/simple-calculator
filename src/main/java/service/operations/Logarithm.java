package service.operations;

public class Logarithm implements Operation {
    @Override
    public double execute(double value, double base) {
        if (value <= 0 || base <= 0) {
            throw new IllegalArgumentException("Value and base must be greater than 0");
        }
        return Math.log(value) / Math.log(base);
    }
}
