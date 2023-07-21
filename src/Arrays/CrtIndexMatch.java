package Arrays;

import java.util.Arrays;

public class CrtIndexMatch {
    public static void main(String[] args){
        int[] arr= {9,2,7,4,6,5,1,8,3};
        int[] brr = new int[arr.length];

        for (int i = 0; i< arr.length;i++){
            brr[i]=arr[i];
        }
        Arrays.sort(brr);
        System.out.println("Wrong index");
        for (int i=0 ;i< arr.length;i++){ // for every element it will compare with index element of brr array

                if (arr[i]!=brr[i]){

                    System.out.println(i+" ");
                }

        }
    }
}
