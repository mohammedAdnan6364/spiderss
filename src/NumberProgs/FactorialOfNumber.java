package NumberProgs;

import java.util.Scanner;

public class    FactorialOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int n = sc.nextInt();
        int factorial= 1;
        for (int i = 1;i<=n;i++){
            factorial= factorial*i;
        }
        System.out.println("Factorial of given number "+n+"is = "+factorial);
    }
}
