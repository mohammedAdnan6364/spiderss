package ProgPatterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value =");
        int n= sc.nextInt();
        for (int i=1;i<=n/2;i++){
            for(int j=1;j<=n/2;j++){
                if(i>=j ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=1;i<=((n/2)+1);i++){
            for(int j=1;j<=((n/2)+1);j++){
                if(i+j<=((n/2)+1)){
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
