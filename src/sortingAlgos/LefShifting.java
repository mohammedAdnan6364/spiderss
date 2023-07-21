package sortingAlgos;

public class LefShifting {
    public static void main(String[] args){
        int [] arr= {1,2,3,4};
        int temp= arr[0];
        for (int i=0;i<arr.length-1;i++){
            arr[i]= arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println("After left shifting :");
        for (int x :arr){
            System.out.println(x + " ");
        }
    }
}
