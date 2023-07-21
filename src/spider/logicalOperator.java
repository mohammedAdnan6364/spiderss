package spider;

public class logicalOperator {
    public static void main(String[] args){
        int a = 10;
        int b= 20;
        int c=30;
        boolean result = !(a<b)&&(b>a)&&(c>b);
        System.out.println(result);
    }
}
