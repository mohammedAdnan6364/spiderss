package AbstrInterface;// new rules which have been added in java 8 version wrt interface

public interface I1 {
    public void m1();// abstract method
    int a = 10;
    public static void m2(){// static method with implementation
        System.out.println("Hello");//rule: not inherited to child class
    }
    default void m3(){// non static method with  implementation
                      // rule: access specifier should be default
        int b=20;
        System.out.println(b);
        System.out.println("Bye");
    }

}
