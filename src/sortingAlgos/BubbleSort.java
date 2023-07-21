package sortingAlgos;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {6,2,5,1,3};
        int n = arr.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<(n-1);j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int x: arr){
            System.out.println(x+" ");
        }
    }
}
