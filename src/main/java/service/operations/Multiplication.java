package main.java.service.operations;

public class Multiplication implements Operation{
    @Override
    public double execute(double x, double y) {
        return x * y;
    }
}
