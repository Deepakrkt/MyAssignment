import java.util.ArrayList;
import java.util.List;

class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange(int min, int max) {
        List<Integer> armstrongNumbersList = new ArrayList<>();

        for (int num = min; num <= max; num++) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if (sum == num) {
                armstrongNumbersList.add(num);
            }
        }

        int[] armstrongNumbersArray = new int[armstrongNumbersList.size()];
        for (int i = 0; i < armstrongNumbersList.size(); i++) {
            armstrongNumbersArray[i] = armstrongNumbersList.get(i);
        }

        return armstrongNumbersArray;
    }
}

public class Assignment1Q2 {
	public static void main(String[] args) {
        int min = 100;
        int max = 999;

        ArmstrongNumBetweenRange armstrongNumFinder = new ArmstrongNumBetweenRange();
        int[] armstrongNumbers = armstrongNumFinder.armstrongNumbersInRange(min, max);

        System.out.println("Armstrong numbers between " + min + " and " + max + ":");
        for (int num : armstrongNumbers) {
            System.out.print(num + " ");
        }
    }
}