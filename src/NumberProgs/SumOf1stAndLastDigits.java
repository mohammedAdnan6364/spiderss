package NumberProgs;

import java.util.Scanner;

public class SumOf1stAndLastDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value = ");
        int n = sc.nextInt();
        int first = 0;
        int last = n%10;
        while (n!=0){
            if (n<10) {
                first = n;
            }
            n = n/10;
        }
        System.out.println("sum of 1st and  last digit is = "+(first+last));
    }
}
