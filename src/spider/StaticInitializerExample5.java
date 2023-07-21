package spider;

public class StaticInitializerExample5 {
    static {
       // main(null);
        System.out.println(StaticInitializerExample5.x);
        System.out.println(StaticInitializerExample5.y);
        System.out.println(StaticInitializerExample5.s);
    }
    static int x = 120;
    static double y = 29.35;
    static String s ="Adnan";

    public static void main(String[] args){
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }
}

