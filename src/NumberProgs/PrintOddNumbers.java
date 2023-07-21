package NumberProgs;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int n = sc.nextInt();
        System.out.println("Odd Digits are");
        while (n!=0){
            int rem = n%10;
            if(rem%2 !=0){
                System.out.println(rem);
            }
            n/=10;
        }
    }
}
