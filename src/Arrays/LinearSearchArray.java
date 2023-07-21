package Arrays;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :");
        int key = sc.nextInt();
        int count=0;
        for (int x :arr){
            if (x==key){
                count++;
                System.out.println("Found");
            }
        }
        if (count==0){
            System.out.println("not found");
        }
    }
}
