package Composition;

class computer{
    String brand;
    double price;
    processor p;

    public computer(String brand,double price,processor p){
        this.brand=brand;
        this.price= price;
        this.p= p;
    }
}
class processor{
    String name;
    String generation;

    public processor(String name, String generation){// if we are using constructor the object should be created oin main class to access the elements inside the constructor
        this.name=name;
        this.generation=generation;
    }
}
public class ComputerDriver {
    public static void main(String [] args){
        processor p = new processor("M1","1st");
        computer com = new computer("Hp",500000,p);
        System.out.println("elements of computer ");
        System.out.println(com.brand);
        System.out.println(com.price);
        System.out.println("Elements of processor");
        System.out.println(com.p.name);
        System.out.println(com.p.generation);

    }
}
