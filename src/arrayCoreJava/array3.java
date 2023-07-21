package arrayCoreJava;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int sum=0;
        int prod=1;
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the "+(i+1)+"value : ");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
            prod*=arr[i];
        }
        System.out.println("The sum of the array elements = "+sum);
        System.out.println("The product of array elements = "+prod);
    }
}
