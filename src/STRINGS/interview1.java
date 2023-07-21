package STRINGS;

import java.util.Scanner;

public class interview1 {//if a2b3 is the input output is aabbb.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String[] arr=s.split("");
        for (int i=1;i<s.length();i+=2){
            String temp=arr[i];
            int a= Integer.parseInt(temp);
            while (a>0){
                System.out.print(arr[i-1]);
                a--;
            }
        }
    }
}
