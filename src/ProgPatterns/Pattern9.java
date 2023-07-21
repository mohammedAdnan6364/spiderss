package ProgPatterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value= ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // or for(int i=5;i>=1;i--)
            for(int j=1;j<=n;j++){
                if (i+j>=n+1){// or if(i<=j)
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
