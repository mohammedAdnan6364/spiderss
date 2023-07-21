package Composition;

public class Car {
    String brand;
    double price;
    engine e = new engine();
}
class engine{
    String chasisNo;
    int capacity;

}
class CarDriver{
    public static void main(String[] args){
        Car c = new Car();
        c.brand= "BMW";
        c.price=10000000;
        c.e.chasisNo="rt63636rt";// in c memory there will we e-->engine object which is dependent by
        // by calling in this way we can access variables from different classes
        c.e.capacity=9;
        System.out.println(c.brand);
        System.out.println(c.price);
        System.out.println(c.e.chasisNo);
        System.out.println(c.e.capacity);
    }
}
