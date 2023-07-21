package sortingAlgos;

import java.util.Arrays;

public class Dup2 {
    public static void main(String [] args){
        int [] arr={1,2,3,1,2,4,5,1,2};
        Arrays.sort(arr);
        System.out.println("Duplicate elements are = ");
        int count=0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]==arr[i+1] && count==0){
                System.out.println(arr[i]+" ");
                count++;
            }
            else if (arr[i]!=arr[i+1]){
                count=0;
            }
        }
    }
}
