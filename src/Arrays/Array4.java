package Arrays;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size= ");
        int n = sc.nextInt();
        int[] arr= new int[n];

        for (int i =0; i< arr.length;i++){
            System.out.print("Enter the "+i+" value = ");
            arr[i]= sc.nextInt();
        }
        System.out.println(" even Values in the array are ");
        for (int i : arr){
            if (i%2==0) {
                System.out.print(" "+i+" ");
            }
        }
    }
}
