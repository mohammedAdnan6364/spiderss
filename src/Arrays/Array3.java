package Arrays;

import java.util.Scanner;

public class Array3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size= ");
            int n = sc.nextInt();
            int[] arr= new int[n];

            for (int i =0; i< arr.length;i++){
                System.out.print("Enter the "+i+" value = ");
                arr[i]= sc.nextInt();
            }
            System.out.println("Values are ");
            for (int i=0; i< arr.length;i++){

                System.out.print(" "+arr[i]+" ");
            }
        }
    }

