import java.util.Scanner;


import java.util.Scanner;

class TaxAmount {
    public double calculateTaxAmount(int ctc) {
        double taxamt = 0;
        if (ctc <= 180000) {
            taxamt = 0;
        } else if (ctc >= 181001 && ctc <= 300000) {
            taxamt = (ctc - 180000) * 0.1;
        } else if (ctc >= 300001 && ctc <= 500000) {
            taxamt = 12000 + (ctc - 300000) * 0.2;
        } else if (ctc >= 500001 && ctc <= 1000000) {
            taxamt = 52000 + (ctc - 500000) * 0.3;
        }
        return taxamt;
    }
}

public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner kp=new Scanner(System.in);
        System.out.println("Enter your ctc:");
        int ctc=kp.nextInt();
        System.out.println("Enter your gender:");
        String gender=kp.nextLine();
        kp.nextLine();
        TaxAmount obj=new TaxAmount();
        System.out.println("Taxable amount is: "+obj.calculateTaxAmount(ctc));

    }
}