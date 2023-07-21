package Arrays;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i=0 ; i< arr.length;i++){
            System.out.println("Enter the "+(i+1)+" value ");
            arr[i]= sc.nextInt();
        }
        int max=0;
        int min=9;
        for (int i=0; i< arr.length;i++){
            if (max<arr[i]){
                max =arr[i];
            }
            else if (min>arr[i]){
                min= arr[i];
            }
        }
        System.out.println("Largest Element = "+max);
        System.out.println("Smallest Element = "+min);

    }
}
