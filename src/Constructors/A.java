package Constructors;

import javax.sound.midi.Soundbank;

public class A {
    int a= 10;
    A(){
        //User Defined Constructor
        //no argumeny
        System.out.println("Hi");
    }
    {
        System.out.println("Multi line non static initializer");
    }
    public void m1(){
        System.out.println("Non static MEthod");
    }
    public static void main(String[] args){
        A obj1 = new A();
        System.out.println(obj1.a);
        obj1.m1();
    }
}
