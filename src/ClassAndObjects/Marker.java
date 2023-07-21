package ClassAndObjects;

public class Marker {
    String color;
    double price;
    String brand;
    public void write(){
        System.out.println("Writing");
    }
}
class MarkerFactory{
    public static void main(String[] args){
        Marker m= new Marker();
        m.color= "blue";
        m.brand="camlin";
        m.price=67.98;
        System.out.println(m.color);
        System.out.println(m.price);
        System.out.println(m.brand);
        m.write();
        Marker m2 = new Marker();
        m2.color="black";
        m2.price=67.353;
        m2.brand="reynolds";
        System.out.println(m2.brand);
        System.out.println(m2.color);
        System.out.println(m2.price);
        m2.write();
    }
}
