package STRINGS;

import java.util.Scanner;

public class conversionUpperToLow2 {// using builtin methods
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s= sc.nextLine();
        String temp="";
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if (Character.isUpperCase(ch)){
                temp+=Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)){
                temp+=Character.toUpperCase(ch);
            }
            else {
                temp+=ch;
            }
        }
        System.out.println(temp);
    }
}
