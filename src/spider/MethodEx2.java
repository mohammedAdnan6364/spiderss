package spider;

public class MethodEx2 {
    public static void main(String [] args){
        System.out.println("Main Method");
        addMethod(34,56);
        subMethod(56,23);
    }
    public static void addMethod(int a,int b){
        System.out.println("Addition ="+(a+b));
    }
    public static void subMethod(int a,int b){
        System.out.println("Sub = "+(a-b));
    }
}
