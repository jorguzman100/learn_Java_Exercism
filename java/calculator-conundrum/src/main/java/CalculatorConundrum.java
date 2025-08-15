class CalculatorConundrum {

    // 1. Implement the method calculate to support a few basic operations
    public String calculate(int operand1, int operand2, String operation) {
        return switch (operation) {
            case "+" -> String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
            case "*" -> String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
            case "/" -> {
                try {
                    yield String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            }

            // 2. Handle illegal operations
            case null -> throw new IllegalArgumentException("Operation cannot be null");
            case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
    }
}

/* class Main {
    public static void main(String[] args) {
        CalculatorConundrum calculator = new CalculatorConundrum();

        // 1. Implement the method calculate to support a few basic operations
        System.out.println(calculator.calculate(16, 51, "+")); // => returns "16 + 51 = 67"
        System.out.println(calculator.calculate(32, 6, "*")); // => returns "32 * 6 = 192"
        System.out.println(calculator.calculate(512, 4, "/")); // => returns "512 / 4 = 128"

        // 2. Handle illegal operations
        System.out.println(calculator.calculate(10, 1, null)); // => throws IllegalArgumentException with message "Operation cannot be null"
        System.out.println(calculator.calculate(10, 1, "")); // => throws IllegalArgumentException with message "Operation cannot be empty"
        System.out.println(calculator.calculate(10, 1, "-")); // => throws IllegalOperationException with message "Operation '-' does not exist"

        // 3. Handle the exception thrown when dividing by zero
        System.out.println(calculator.calculate(512, 0, "/")); // => throws IllegalOperationException with message "Division by zero is not allowed"
    }
} */
