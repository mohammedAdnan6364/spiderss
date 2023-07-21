package spider;

public class StaticInitializerWithMainMethod2 {
    static{
        main(null);
        System.out.println("Static Initializer1");
    }
    static int a=100;
    public static void main(String[] args){
        System.out.println(a);
        System.out.println("Main method");
    }
    static {
        System.out.println(a);
        a=26;
        main(null);
        System.out.println("Static initializer2");
    }
}
//1st static multilines and single line static  will we executed//