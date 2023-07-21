package ProgPatterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows= ");
        int a = sc.nextInt();
        System.out.println("enter the no of rows= ");
        int b= sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if (i+j<=a+1){
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
