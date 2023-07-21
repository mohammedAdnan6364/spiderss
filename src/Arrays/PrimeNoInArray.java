package Arrays;

import java.util.Scanner;

public class PrimeNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " value=");
            arr[i] = sc.nextInt();
        }
       for (int x :arr){
           int count =0;
           if(x==1){
               continue;
           }
           for (int i=2 ;i<x;i++){

               if(x%i==0){
                   count++;
                   break;
               }
           }
           if (count==0){
               System.out.println(x);
           }
       }
    }
}
