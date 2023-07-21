package AbstrInterface;

public class A implements I1 {

    @Override
    public void m1() {
        System.out.println("Hii");
    }
    public void m3(){// overridden m3 method from the interface class
        System.out.println("Overridden m3 method");
    }
    public static void main(String[] args){
        System.out.println(a);// final variable from I1
        I1.m2();// static method from I1
        A obj = new A();
        obj.m3();
    }
}
