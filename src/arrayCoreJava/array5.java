package arrayCoreJava;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int sumeven=0;
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the "+(i+1)+"value : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The even elemnes are");
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                sumeven+=arr[i];
                System.out.print(" "+arr[i]+" ");
            }
        }
        System.out.println("Sum of even  array elemnets : "+sumeven);
    }
}
// print odd number
// sum of odd
//prod of even
//pro odd
//print element on even index
//on odd index