package STRINGS;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String rev="";
        for (int i=s.length()-1;i>=0;i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(s)){//if we use== here it will compare with reference ,so we are using equals to check whether it is palindrome or not
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    }

