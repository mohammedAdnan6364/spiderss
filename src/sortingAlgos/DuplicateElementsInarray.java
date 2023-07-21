package sortingAlgos;

import java.util.Arrays;

public class DuplicateElementsInarray {
    public static void main(String[] args){
        int [] arr={1,2,3,1,2,4,5,1,2};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Duplicate Elements are :");
        for (int i=0;i<n;i++){
           // int a=arr[i];// stores 1st after every iteration element to compare with all the remainning elemenets
            for(int j=i+1;j<n;j++){

               // int b=arr[j];//stores 2nd value to compare with 1st element whether its duplicate ornot for everey iteration
                if (arr[i]==arr[j]){

                    System.out.println(arr[j]);
                }

            }
        }
    }
}
