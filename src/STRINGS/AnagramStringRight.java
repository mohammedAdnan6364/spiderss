package STRINGS;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramStringRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String s1= sc.nextLine();
        System.out.println("Enter the String2 : ");
        String s2=sc.nextLine();
        if (s1.length()==s2.length()) {// step 1 - compare lengths of two string
            s1 = s1.toLowerCase();// step2 - compare to same case and character array
            s2 = s2.toLowerCase();
            char ch1[] = s1.toCharArray();// to character array to compare each character
            char ch2[] = s2.toCharArray();
            Arrays.sort(ch1);// step3- sort the char array and compare
            Arrays.sort(ch2);
            int count = 0;
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == ch1[i]) {
                    count++;
                }
            }
            if (count == ch1.length) {// in the above for loop each character is compared and count is incremented after that step we are here comparing count with c1.length to check whether the all the characters are same or not and compare with length
                System.out.println("Anagrams");
            } else {
                System.out.println("Not a Anagrams");
            }
        }
            else {
            System.out.println("Not a Anagrams");
            }
        }
    }

