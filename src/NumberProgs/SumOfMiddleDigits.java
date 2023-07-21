package NumberProgs;

import java.util.Scanner;

public class SumOfMiddleDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int n = sc.nextInt();
        n = n/10;
        int sum=0;
        while (n!=0){
            if (n>=10){
                sum +=n%10;
            }
            n /=10;
        }
        System.out.println("Sum of Middle Digits is = "+sum);

    }
}
