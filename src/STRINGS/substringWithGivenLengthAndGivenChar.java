package STRINGS;

import java.util.Scanner;

public class substringWithGivenLengthAndGivenChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        System.out.println("Enter the character : ");
        char ch= sc.next().charAt(0);// if we write 0 index starts from 0th index
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++) {// here s.length is = because in substring method (0,3)will take till 3 not 3 so
                String temp = s.substring(i, j);
                if (temp.contains(String.valueOf(ch)) && temp.length()>=n){// here ch will be converted to string and contains methods say true or false and also takes given lenght
                    System.out.println(temp);
                }
            }

        }
    }
}
