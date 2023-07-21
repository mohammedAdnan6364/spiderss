package spider;

public class MethodOverloading {
    public static void main(String[] args){
        System.out.println(12+67.66f);
        System.out.println(3.4+82828282828l);

    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public static void  add(int a ,float b){
        System.out.println(a+b);

    }
    public static void  add(float a , long b){
        System.out.println(a+b);
    }
}
