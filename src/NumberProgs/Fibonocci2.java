package NumberProgs;

import java.util.Scanner;

public class Fibonocci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value = ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        //System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++){
            int c = a + b;
            if (i == n) {
                System.out.println(c + " ");
            }
            a = b;
            b = c;

        }
    }
}
