package Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        int[] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values = ");
        for (int i =0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Values are ");
        for (int i=0; i< arr.length;i++){

            System.out.print(" "+arr[i]+" ");
        }
    }
}
