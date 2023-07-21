package spider;

public class StaticEx5 {
    public static void main(String[] args){
        System.out.println(s);
        String s= "Hello";
        System.out.println(s);
        m1();
        m2();
        System.out.println(StaticEx5.s);

    }
    public static void m1(){
        s="Bye";
        m2();
        System.out.println(s);

    }
    public static void m2(){
        System.out.println(s);
        s="good";
    }
    static String s= "Hi";
}
