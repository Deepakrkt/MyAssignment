package exceptionhandling;
import java.util.Scanner;

public class Exception1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = kp.nextInt();

        System.out.print("Enter second number: ");
        int n2 = kp.nextInt();

        try {
            if (n2 == 0) {
                throw new UnsupportedOperationException("Division by zero is not allowed.");
            }

            int res = n1 / n2;
            System.out.println("Result: " + res);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    

	}

}
