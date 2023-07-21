package arrayCoreJava;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size= sc.nextInt();
        int [] arr=new int[size];
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the "+(i+1)+"value :");
            arr[i]= sc.nextInt();
        }
        System.out.println("The values are : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
