package ProgPatterns;

import java.util.Scanner;

public class Pattern4Scanner {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of rows =");
        int a= sc.nextInt();
        System.out.println("Enter the no of columns =");
        int b= sc.nextInt();
    for (int i =1;i<=a;i++){
        for(int j =1;j<=b; j++){
            if (i<=j){
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
