package arrayCoreJava;

import java.util.Scanner;

public class array6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the "+(i+1)+" value  : ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for (int x:arr){
            System.out.print(" " +x+" ");
        }
    }
}
