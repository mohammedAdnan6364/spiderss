package spider;

public class StaticVariableEx3 {
    static int x;
    static String s;
    public static void main(String [] args){
        int x=200;//local scope
        System.out.println(StaticVariableEx3.x);
        x=90;//value os local variable is been changed
        System.out.println(x);
        System.out.println(StaticVariableEx3.x);
        String s="Hello";// local scope becuz we have given datatype
        StaticVariableEx3.s="Adnann";// static value of string has been changed to Adnannn from null
        System.out.println(s);
        System.out.println(StaticVariableEx3.s);// this will go to static string
    }
}
