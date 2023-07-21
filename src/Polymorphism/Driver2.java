package Polymorphism;

class Dog extends Animal{
    public void sound(){
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meowwww");
    }
}
class Cow extends Animal{
    public void sound(){
        System.out.println("moooo");
    }
}
class Animal {// Parent
    public void sound(){
        System.out.println("Animals make sound");
    }
}
public class Driver2{
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
        Animal b = new Cat();
        b.sound();
        Animal c = new Cow();
        c.sound();

    }
}
