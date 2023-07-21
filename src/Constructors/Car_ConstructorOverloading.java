package Constructors;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.PublicKey;

public class Car_ConstructorOverloading {
    String color;
    String brand;
    int model;
    double price;
    int seating;

    Car_ConstructorOverloading(){

    }
    Car_ConstructorOverloading(String color, String brand){
        this.color=color;
        this.brand=brand;
    }
    Car_ConstructorOverloading(String color,String brand,int model){
       // this.color=color;//
       // this.brand=brand;
        this(color,brand);
        this.model= model;
    }
    Car_ConstructorOverloading(String color,String brand,int model,double price) {
//       // this.color = color;
//        this.brand = brand;
//        this.model = model;
        this(color, brand, model);
        this.price = price;
    }
    Car_ConstructorOverloading(String color,String brand,int model,double price,int seating) {
//        this.color = color;
//        this.brand = brand;
//        this.model = model;
//        this.price = price;
        this(color, brand, model, price); //CONSTRUCTOR CHAINING!!!!!!!----> THIS CALL STATEMENT
                                          // AND IT SHOULD WE ON TOP IN A CONSTRUCTOR
        this.seating = seating;
    }
    public void details(){
        System.out.println("Color of the car= "+color);
        System.out.println("Brand of color= "+brand);
        System.out.println("model of the car= "+model);
        System.out.println("price of car= "+price);
        System.out.println("total seating= "+seating);
    }

}
class CarDriver {
    public static void nextLine(String stat){
        System.out.println();
        System.out.println("[ Passing "+stat+" ]");
        System.out.println();
    }
    public static void main(String[] args) {
        Car_ConstructorOverloading car1 = new Car_ConstructorOverloading();
        nextLine("Constructor with no arguments");
        car1.details();
        Car_ConstructorOverloading car2 = new Car_ConstructorOverloading("blue", "BMW");
        nextLine(" Constructor argsR with color and brand");
        car2.details();
        Car_ConstructorOverloading car3 = new Car_ConstructorOverloading("Black", "Benz", 67);
        nextLine("Constructor  args with color, brand and model");
        car3.details();
        Car_ConstructorOverloading car4 = new Car_ConstructorOverloading("Gold", "Bugatti", 87, 10000000);
        nextLine("Constructor args with color, brand, model, price");
        car4.details();
        Car_ConstructorOverloading car5 = new Car_ConstructorOverloading("White", "ferrari", 76, 80000000, 6);
        nextLine("Constructor args with color, brand, model, price, seating");
        car5.details();


    }
}
