package sortingAlgos;

public class InsertionSort {
    public static void main(String [] args){
        int [] arr={6,4,1,8};
        int n= arr.length;
        for (int i=1;i<n;i++){
            int temp= arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        System.out.println("Sorted array ");
        for (int x: arr){
            System.out.println(x+" " );
        }
    }
}
