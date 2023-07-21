package STRINGS;

import java.util.Scanner;

public class removeSpaces2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String temp="";
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);// to take every character from the string for loop is required
            if (ch!=' '){// if this goes true concatenation will happen with characters
                temp+=ch;
            }
        }
        System.out.println(temp);
    }
}
