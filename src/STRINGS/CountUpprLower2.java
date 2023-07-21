package STRINGS;

import java.util.Scanner;

public class CountUpprLower2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s =sc.nextLine();
        int lower=0;
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if (ch>='a'&& ch<='z'){
                lower++;
            }
        }
        System.out.println("lower case "+lower);
        System.out.println("upper case "+(s.length()-lower));
    }
}
