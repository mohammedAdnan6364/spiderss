package STRINGS;

import java.util.Scanner;

public class SubstringwithivenString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.println("Enter the key");
        String key = sc.next();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++) {// here s.length is = because in substring method (0,3)will take till 3 not 3 so
                String temp = s.substring(i, j);
                if (temp.contains(key)){// here ch will be converted to string and contains methods say true or false
                    System.out.println(temp);
                }
            }

        }
    }
}
