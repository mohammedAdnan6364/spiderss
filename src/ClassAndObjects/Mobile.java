package ClassAndObjects;

public class Mobile {
    String brand;
    double price;
    String ram;
    String processor;
    String mah;
    String model;

    public void details(){
        System.out.println("Mobile brand = "+brand);
        System.out.println("Mobile price = "+price);
        System.out.println("Mobile RAM = "+ram);
        System.out.println("Mobile processor = "+processor);
        System.out.println("Mobile MAH = "+mah);
        System.out.println("Mobile Model = "+model);
    }
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "OnePlus";
        obj1.price = 65000.00;
        obj1.ram = "8gb";
        obj1.processor = "Snapdragon855+";
        obj1.mah="5000mah";
        obj1.model="8t";
        obj1.details();
        System.out.println("| Object 2 |");
        Mobile obj2 = new Mobile();
        obj2.brand = "Xiomi";
        obj2.price = 32000.00;
        obj2.ram = "8gb";
        obj2.processor = "Snapdragon870";
        obj2.mah="5000mah";
        obj2.model="11x";
        obj2.details();
    }
}
