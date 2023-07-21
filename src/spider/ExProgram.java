package spider;

public class ExProgram {      //Sum of even numbers from 1 to 20
    public static void main(String[] args){
        int sum=0;
        for (int i=0;i<=20;i++){
            if (i%2==0){
                sum= sum+i;
            }
        }
        System.out.println("SUm of even numbers ="+sum);
    }
}
