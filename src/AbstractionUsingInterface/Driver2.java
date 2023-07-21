package AbstractionUsingInterface;// I1 interface and A,B classes

public class Driver2 {
    public static void main(String[] args){
        I1 obj = new B();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
