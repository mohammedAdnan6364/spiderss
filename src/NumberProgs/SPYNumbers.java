package NumberProgs;

import java.util.Scanner;

public class SPYNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value =");
        int n = sc.nextInt();
        int sum= 0;
        int prod= 1;
        while (n!=0){
            int rem = n %10;
            sum += rem;
            prod *= rem;
            n = n/10;
        }
        if(sum==prod){
            System.out.println("Its a spy number");
    }else {
            System.out.println("Not a spy number");
        }
}

}

