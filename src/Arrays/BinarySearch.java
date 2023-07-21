package Arrays;
import javax.sound.midi.Soundbank;
import java .util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr= {9,8,7,6,4,5,3,1,2};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be Searched ");
        int n = sc.nextInt();
        int  low=0;
        int high = arr.length-1;
        int count=0;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==n){
                count++;
                System.out.println("Element Found ");
                break;
            }
            else if (arr[mid]<n){
                low= mid+1;
            }
            else if(arr[mid]>n){
                high = mid-1;
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }
    }
}
