package NumberProgs;

import java.net.StandardSocketOptions;
import java.util.Scanner;
// sum of 1st and last === sum of middle digits
//from this program all the programs will be written in methods
public class XylemOrPhloemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value = ");
        int n = sc.nextInt();
        int sum1 = SumOf1stAndLast(n);
        int sum2 = SumOfMiddleDigits(n);
        if(sum1==sum2){
            System.out.println("Xylem Number");
        }else {
            System.out.println("Phloem Number");
        }
    }

    public static int SumOf1stAndLast(int a) {
        int sum = 0;
        int first = 0;
        int last = a % 10;
        while (a != 0) {
            if (a < 10) {
                first = a;
            }
            a = a / 10;
        }
        sum = first+last;
        return sum;
    }
    public static int SumOfMiddleDigits(int a){
        a = a/10;
        int sum=0;
        while (a!=0){
            if (a>=10){
                sum +=a%10;
            }
            a /=10;
        }
        return sum;
    }
}
