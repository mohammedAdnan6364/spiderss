package ProgPatterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of rows =");
        int a= sc.nextInt();
        System.out.println("Enter the no of columns =");
        int b= sc.nextInt();
        for (int i =1;i<=a;i++){
            for(int j =1;j<=b; j++){
                if (i<=j){
                    if(i%2==0){
                        System.out.print(1);
                    }else {
                        System.out.print(0);
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

