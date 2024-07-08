package main.java.service.operations;

public class Division implements Operation{

    @Override
    public double execute(double x, double y) {
        return x / y;
    }
}
