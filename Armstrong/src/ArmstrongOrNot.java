import java.util.Scanner;
import java.lang.Math;

public class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
        int t1, d = 0, l = 0, sum = 0;

        t1 = num;

        while (t1 > 0) {
            t1 = t1 / 10;
            d++;
        }
        t1 = num;
        while (t1 > 0) {
            l = t1 % 10;
            sum += (Math.pow(l, d));
            t1 = t1 / 10;
        }
        return num == sum;
    }
	public static class Assignment1Q1 {
		public static void main(String[] args) {
			int num;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number to Check: ");
            num = sc.nextInt();
            ArmstrongOrNot obj = new ArmstrongOrNot();
            if (obj.armstrongCheck(num))
                System.out.print("Armstrong");
            else System.out.println("Not an Armstrong");
        }
	}
		

	}


