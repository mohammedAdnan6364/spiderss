package Arrays;

import java.util.Scanner;

public class SearchingArrayElements {// Linear Search
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i =0 ; i< arr.length;i++){
            System.out.println("Enter the "+(i+1)+" value");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Element to Search :");
        int key = sc.nextInt();
    }
}
