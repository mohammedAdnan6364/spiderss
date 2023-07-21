package arrayCoreJava;

import java.util.Arrays;

public class studentArray1 {
    public static void main(String[] args){
        student1[] arr=new student1[3];
        arr[0]=new student1(1,"Adnan",8787878);
        arr[1]=new student1(3,"Adn",878787890);
        arr[2]=new student1(2,"Adnan",878878000);
        Arrays.sort(arr);
        for (student1 x: arr){
            System.out.println(x);
        }
    }
}
// ass class book -- id, no of pages price