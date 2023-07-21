package sortingAlgos;

public class SelectionSort {
    public static void main(String[] args){
        int [] arr= {2,3,6,1,8,3,7,11,8};
        System.out.println("Sorted array is");
        for (int i=0;i< arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int x:arr){
            System.out.print(x);
        }
    }

}
