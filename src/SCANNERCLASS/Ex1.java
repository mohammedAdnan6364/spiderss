package SCANNERCLASS;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit1 ");
        int a= sc.nextInt();
        System.out.println("Enter digit2");
        int b= sc.nextInt();
        System.out.println("Sum Obtained = "+(a+b));
    }
}
