package sortingAlgos;

public class RightShifting {
    public static void main(String [] args){
        int[] arr={1,2,3,4};
        int temp=arr[arr.length-1];
        for (int i= arr.length-1;i<0;i++){
            arr[i]= arr[i-1];
        }
        arr[0]=temp;
        System.out.println("after Right shifting :");
        for (int x: arr){
            System.out.println(x+" ");
        }
    }
}
