package lambda;

@FunctionalInterface
interface ArithmeticOperation {
    double calculate(int num1, int num2);
}

public class Assignment4Q1 {
    public double addition(int num1, int num2) {
        ArithmeticOperation add = (a, b) -> a + b;
        return add.calculate(num1, num2);
    }

    public double subtraction(int num1, int num2) {
        ArithmeticOperation subtract = (a, b) -> a - b;
        return subtract.calculate(num1, num2);
    }

    public double multiplication(int num1, int num2) {
        ArithmeticOperation multiply = (a, b) -> a * b;
        return multiply.calculate(num1, num2);
    }

    public double division(int num1, int num2) {
        ArithmeticOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return (double) a / b;
        };
        return divide.calculate(num1, num2);
    }

    public static void main(String[] args) {
        Assignment4Q1 obj = new Assignment4Q1();

        int num1 = 13;
        int num2 = 5;

        System.out.println("Addition of " + num1 + " and " + num2 + ": " + obj.addition(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + ": " + obj.subtraction(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + ": " + obj.multiplication(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + ": " + obj.division(num1, num2));
    }
}
