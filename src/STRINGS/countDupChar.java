package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class countDupChar {// interview 2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String temp="";
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                temp+=arr[i];
            }
        }

        temp+=arr[arr.length-1];
        String res="";
        for (int i=0;i<temp.length();i++){
            char ch1= temp.charAt(i);
            int count=0;// this we have written in the for because for every char the count should work
            for (int j=0;j<s.length();j++){
                char ch2= s.charAt(j);
                if (ch1==ch2){
                    count++;
                }
            }
            res=res+ch1+count;
        }
        System.out.println(res);
    }
}
