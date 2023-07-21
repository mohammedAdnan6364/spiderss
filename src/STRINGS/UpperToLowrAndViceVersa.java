package STRINGS;

import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

public class UpperToLowrAndViceVersa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String temp="";
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if (ch>='a' && ch<='z'){
                ch = (char) (ch-32);
                temp+=ch;
            }
            else  if (ch>='A' && ch<='Z'){
                ch = (char) (ch+32);// the value will be in the form of interger so we are type casting to ch as the narrowing is happening so it wll convert it into the char value
                temp+=ch;
            }
            else {
                temp+=ch;
            }
        }
        System.out.println(temp);

    }
}
