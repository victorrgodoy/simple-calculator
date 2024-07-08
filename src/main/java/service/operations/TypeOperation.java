package service.operations;

import lombok.Getter;

@Getter
public enum TypeOperation {
    ADDITION("addition", "+"),
    SUBTRACTION("subtraction", "-"),
    MULTIPLICATION("multiplication", "*"),
    DIVISION("division", "/"),
    EXPONENTIATION("exponentiation", "ˆ"),
    LOGARITHM("logarithm", "log"),
    SQUARE_ROOT("square root", "sqrt");

    private final String name;
    private final String symbol;

    TypeOperation(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public static TypeOperation fromString(String input) {
        for (TypeOperation operation : TypeOperation.values()) {
            if (operation.name.equalsIgnoreCase(input) || operation.symbol.equalsIgnoreCase(input)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Invalid operation: " + input);
    }
}