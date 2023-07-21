package STRINGS;

import java.util.Scanner;

public class countOfUpperAndLowes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        int count1=0;
        int count2=0;

        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){//upper case range
                count1++;
            }
            else if(ch>=97 && ch<=122){//lower case range ascii values
                count2++;
            }
            else{
                System.out.println(ch+" is not an Alphabets ");
            }
        }
        System.out.println("No of uppercase characters are = "+count1);
        System.out.println("No of uppercase characters are = "+count2);

        }
    }

