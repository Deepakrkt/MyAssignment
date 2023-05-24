package exceptionhandling;
import java.util.Scanner;

public class Exception1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kp = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = kp.nextInt();
        System.out.print("Enter second number: ");
        int num2 = kp.nextInt();
        try {
            int result = (num1/num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed." );

	}

	}
}
