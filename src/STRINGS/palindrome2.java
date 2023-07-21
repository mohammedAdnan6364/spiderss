package STRINGS;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        String s2 = new String(rev);
        if (s.equals(s2)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
