package ClassAndObjects;

public class ThisKeyword {
    int a =10;
    public void m1(){
        int a= 25;
        System.out.println(a);
        System.out.println(this.a);
        this.a=89;
        System.out.println(this.a);
        // we can only use this keyword inside the non-static members
        // and this keyword cannot be used in static methods
    }
    public static void main(String[] args){
        ThisKeyword obj1 = new ThisKeyword();
        obj1.m1();
    }
}
