package arrayCoreJava;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the "+(i+1)+"value : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("the even elements are : ");
        for (int i=0;i< arr.length;i++){
           if (arr[i]%2==0){
               System.out.print(" "+arr[i]+" ");
           }
        }

    }
}
