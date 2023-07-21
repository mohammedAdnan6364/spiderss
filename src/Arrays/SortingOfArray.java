package Arrays;
import java.util.Arrays;
public class SortingOfArray {
    public static void main(String [] args){
        int[] arr = {7,2,3,4,5,9,3,4};
        System.out.println("Before Sorting");
        for (int x: arr){
            System.out.print(x+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("After sorting");
        for (int x: arr){
            System.out.print(x+" ");
        }

    }
}
