import java.util.Scanner;

public class ScannerDynamicRead {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name= sc.nextLine();
        System.out.println("Hello "+name);
    }
}
