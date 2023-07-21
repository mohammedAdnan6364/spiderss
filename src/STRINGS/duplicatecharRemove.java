package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class duplicatecharRemove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        char[] arr=s.toCharArray();// converts the string to character array
        Arrays.sort(arr);
        String temp="";
        for (int i=0;i< arr.length-1;i++){// inside the loop we are writing arr[i+1] so we are writing the condition arr.length-1
            if (arr[i]!=arr[i+1]){
                temp+=arr[i];
            }
        }
       temp+=arr[arr.length-1];
        System.out.println(temp);
    }
}
