package STRINGS;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String s1= sc.nextLine();
        System.out.println("Enter the String2 : ");
        String s2 = sc.nextLine();
        s1.toLowerCase();
        s2.toLowerCase();
        int l1=s1.length();
        int l2=s2.length();
        if (l1!=l2){
            System.out.println("Not a Anagram ");
        }
        else if (l1==l2){
            for (int i=0;i<s1.length();i++) {
                char ch = s1.charAt(i);
                for (int j=0;j<s2.length();j++){
                    char ch1= s2.charAt(j);
                    if (ch==ch1){
                        System.out.println("its a anagram");
                    }
                    else {
                        System.out.println("not a anagram");
                    }
                }
            }
        }
    }
}
