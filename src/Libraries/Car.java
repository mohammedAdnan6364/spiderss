package Libraries;

public class Car {
    int wheels;
    String name;
    String model;
    double price;

    public Car( int wheels,String  name, String  model, double price){
        this.wheels=wheels;
        this.name=name;
        this.model=model;
        this.price=price;
    }
    public String toString(){
        return "Wheels = "+wheels+
                "\nName = "+name+
                "\nModel = "+model+
                "\nPrice = "+price;
    }
}
