package Polymorphism;// RUNTIME POLYMORPHISM

class A{
    public void test(){
        System.out.println("Hi");
    }
}
class B extends A{
    public void test(){
        System.out.println("Hello");
    }
}
class C extends A{
    public void test(){
        System.out.println("Bye");
    }
}

public class Driver {
    public static void main(String [] args){
        A obj = new B();
        obj.test();
    }
}
