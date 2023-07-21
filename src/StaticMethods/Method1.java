package StaticMethods;


public class Method1 {
    public static void main(String[] args){
        System.out.println("Main method");
        Method1.m1();
        Method1.m2();


    }
    public static void m1(){
        System.out.println("MEthod 2");
    }
    public static void m2(){
        System.out.println("method 2");
    }
}
class Method2{
    public static void main(String[] args){
        System.out.println("Main method from method 3 calss");
        Method1.m1();
        Method1.m2();
        m3();
        m4();
    }
    public static void m3(){
        System.out.println("M3 method");
    }
    public static void  m4(){
        System.out.println("M4 method");
    }
}
