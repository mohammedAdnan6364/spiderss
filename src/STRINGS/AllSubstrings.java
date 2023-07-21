package STRINGS;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++)// here s.length is = because in substring method (0,3)will take till 3 not 3 so
                System.out.println(s.substring(i,j));
        }
    }
}
