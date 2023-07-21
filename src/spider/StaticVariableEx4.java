package spider;

public class StaticVariableEx4 {
    static int a;
    public static void main(String [] args){
        int a=50;
        StaticVariableEx4.a=m1(25);
        System.out.println(a);
        System.out.println(StaticVariableEx4.a);
        a = m2();
        System.out.println(a);
        System.out.println(StaticVariableEx4.a);
    }
    public static int m1(int a){
        return a;
    }
    public static  int m2(){
        System.out.println(StaticVariableEx4.a);
        return 789;

    }
}
