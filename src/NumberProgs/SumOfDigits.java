package NumberProgs;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value =");
        int n = sc.nextInt();
        int sum= 1;
        while (n!=0){
            int rem = n %10;
            sum += rem;
            n = n/10;
        }
        System.out.println("Product of digits = "+sum);
    }
}

