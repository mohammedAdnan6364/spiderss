package spider;

public class StaticVariableEx2 {
    static int x=98;
    static int y;
    static int z=90;
    public static void main(String[] args){
        int x=20;// local varaibla
        System.out.println(x);
        System.out.println(StaticVariableEx2.x);
        m1();
        m2();
        System.out.println(x);
        m3();

    }
    public static void m1(){
        y=90;
        System.out.println(y);
    }
    public static void m2(){
        x=9;
        y=98;
        System.out.println(x+y);
    }
    public static void m3(){
       int z=67;
        System.out.println(z);
        System.out.println(StaticVariableEx2.z);
    }
}
