package NumberProgs;

import java.util.Scanner;

public class NeonNumbers {
    // square number and given number should be same
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int n = sc.nextInt();
        int sq =n*n;
        int sum = 0;
        while (sq!=0){
            int rem = sq %10;
            sum += rem;
            sq =sq/10;
        }
        if (n == sum){
            System.out.println("Neon number");
        }else {
            System.out.println("NOT a neon number");
        }
    }
}
