package STRINGS;

import java.util.Locale;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        int vowels=0;
        //int consonents=0;
        s=s.toLowerCase();

        for (int i=0;i<s.length()-1;i++){
           char ch = s.charAt(i);
            if(ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowels++;
            }
//            else {
//                consonents++;
//            }
        }
        System.out.println("vowels = "+vowels);
        //System.out.println("consonents = "+consonents);
        System.out.println("consonent = " +(s.length()-vowels));
    }
}
// ass= print how many lower case how many upper case