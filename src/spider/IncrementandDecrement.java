package spider;

public class IncrementandDecrement {
    public static void main(String[] args){
        int a= 10;
        int b=5;
        int res= a++ + --b - --a + ++b - ++a - a++ + b-- + --b - --a;
        System.out.println(res);
        System.out.println(a);
        System.out.println(b);
    }
}
