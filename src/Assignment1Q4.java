import java.util.Scanner;

class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        String res = "";
        int count = 0;
        if (subject1Marks > 60) {
            count++;
        }
        if (subject2Marks > 60) {
            count++;
        }
        if (subject3Marks > 60) {
            count++;
        }
        if (count == 3) {
            res = "Passed";
        } else if (count == 2) {
            res = "Promoted";
        } else {
            res = "Failed";
        }
        return res;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner kp=new Scanner(System.in);
        System.out.println("Enter marks:");
        int mSub1=kp.nextInt();
        int mSub2=kp.nextInt();
        int mSub3=kp.nextInt();
        ResultDeclaration obj=new ResultDeclaration();
        System.out.println(obj.declareResults(mSub1,mSub2,mSub3));
    }

    }
