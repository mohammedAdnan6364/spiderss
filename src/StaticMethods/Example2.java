package StaticMethods;

public class Example2 {
    static int a= 100;
    static {
        System.out.println("Static Initializer 1");
    }
    public static void main(String [] args){
        System.out.println(a);
        Example2.a=m1(15);
        System.out.println(a);
        m2();
        System.out.println(Example2.a);
    }
    static {
        System.out.println("static Initializer 2");
    }
    public static int m1(int a){
        System.out.println(a);
        return a;
    }
    public static int m2(){
        System.out.println(a);
        return 150;
    }
}
