package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.print("Enter the Size = ");
        System.out.println();
        System.out.println("-----------------");
        int n = sc.nextInt();
        int [] arr= new int[n];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the "+(i+1)+" value =");
            arr[i]= sc.nextInt();
        }
        System.out.println("Before Sorting");
        System.out.println("--------------");
        for (int x :arr){
            System.out.print(x+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("After sorting ");
        System.out.println("--------------");
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Enter the Element to be Searched ");
        int key = sc.nextInt();

        int low=0;
        int high= arr.length-1;
        int count=0;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                count++;
                System.out.println("Element Found");
                break;
            }
            else if (arr[mid]<key){
                low=mid+1;
            }
            else if (arr[mid]>key){
                high= mid-1;
            }
        }
        if (count==0){
            System.out.println("Element Not Found");
        }

    }

}
