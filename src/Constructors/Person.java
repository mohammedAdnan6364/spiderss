package Constructors;

public class Person {
    int id;
    String name;
    String email;
    long phone;

    Person() { //no argument constructor
        System.out.println("No argument Constructor");
    }

    Person(int id, String name, String email, long phone) {
        System.out.println("Parameterized Constructor");
        this.id = id;//because non-static variable and local variable are of Same name!!!!!
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void details() {
        System.out.println("Person id =" + id);
        System.out.println("PErson name =" + name);
        System.out.println("Person email =" + email);
        System.out.println("person phone =" + phone);
    }
}
    class personDriver{
        public static void main(String[] args){
            Person  p1= new Person();
            p1.id=10;
            p1.name="Adnan";
            p1.email="Adn.gmail.com";
            p1.phone=877272727;
            p1.details();

            Person p2 = new Person(4,"Adn","moh.gamil.com",98989898);// constructor
            // with parameters should be called like this with object and inside the constructor we need
            // to pass the arguments !!!
            p2.details();
        }
    }


