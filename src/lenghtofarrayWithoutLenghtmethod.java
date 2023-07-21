public class lenghtofarrayWithoutLenghtmethod {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=1;
        int res= correctIndex(arr,start,end);
    }
    static int count=0;
    public static int correctIndex(int[] arr, int start, int end){
        try{
            int temp= arr[end];
            System.out.println(temp);
            if (count==0){
                end=end*2;
                return correctIndex(arr, start, end);
            }// automorphic number
            else {
                return end;
            }
        }
        catch (ArrayIndexOutOfBoundsException o){
            count++;
            return correctIndex(arr, start, end);
        }
    }
}
