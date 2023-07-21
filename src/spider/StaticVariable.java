package spider;

public class StaticVariable {
    static int x=10;
    static  int y=20;//declaration of static variable // scope of this variable is everywhere//
    // scope is global , in java global scope means ----> static and non static both
    public static void main(String[] args){
        System.out.println(x);
        m1();
        add();

    }
    public static void m1(){
        System.out.println(x);
    }
    public static void add(){
        System.out.println(x+y);
    }
}
