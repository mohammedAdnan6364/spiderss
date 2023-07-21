package STRINGS;

import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String s = sc.nextLine();
            String temp="";
            //int consonents=0;
            s=s.toLowerCase();

            for (int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch !='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'){
                    temp+=ch;
                }
            }
            System.out.println(temp);
        }
    }
