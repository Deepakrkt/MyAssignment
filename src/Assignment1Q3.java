import java.util.Scanner;
import java.lang.Math;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double SimInt=(principalAmount*time*interestRate)/100;
        return SimInt;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){

        double CompInt=principalAmount*Math.pow((1+(interestRate/100)),time)-principalAmount;
    return CompInt;
    }
}
public class Assignment1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kp=new Scanner(System.in);
	        System.out.println("Amount:");
	        double pAmount=kp.nextDouble();
	        System.out.println("Time:");
	        int time=kp.nextInt();
	        System.out.println("Interest rate:");
	        double intRate=kp.nextDouble();
	        SiCi obj=new SiCi();
	        System.out.printf("Simple interest on the given amount is %.2f\n",obj.simpleInterest(pAmount,time,intRate));
	        System.out.printf("Compound interest on the given amount %.2f",obj.compoundInterest(pAmount,time,intRate));

	}

}
