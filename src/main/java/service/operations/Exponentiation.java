package service.operations;

public class Exponentiation implements Operation {
    @Override
    public double execute(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}