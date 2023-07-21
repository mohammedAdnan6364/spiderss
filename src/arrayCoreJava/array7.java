package arrayCoreJava;

import java.util.Arrays;

public class array7 {
    public static void main(String[] args){
        int[] arr= {5,4,5,8,9,5,4,6};
        Arrays.sort(arr);
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        char[] ch={'d','j','a','y','t'};
        Arrays.sort(ch);
        for (char c:ch){
            System.out.print(c+" ");
        }
    }
}
