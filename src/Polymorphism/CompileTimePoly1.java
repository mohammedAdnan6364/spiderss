package Polymorphism;
// Compile time polymorphism here we achieve by using static methods inside the methods
class  AA{
    public static void m1(){
        System.out.println("Hi");
    }
}
class b extends  AA{
    public static void m1(){
        System.out.println("Hello");
    }
}
class c extends b{
    public static void m1(){
        System.out.println("Bye");
    }
}
public class CompileTimePoly1 {
    public static void main(String[] args){
        AA obj = new b();
        obj.m1();
    }
}
