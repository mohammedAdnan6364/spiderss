package NumberProgs;

import java.util.Scanner;

public class FibonicciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i= n-2;i>0;i--){
           int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
