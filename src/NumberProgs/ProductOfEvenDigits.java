package NumberProgs;

import java.util.Scanner;

public class ProductOfEvenDigits {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value = ");
        int n = sc.nextInt();
        int prod= 1;
        while (n!=0){
            int rem =  n%10;
            if (rem%2==0){
                prod *=rem;
            }
            n /=10;
        }
        System.out.println("Sum of even numbers is "+prod);
    }
}
