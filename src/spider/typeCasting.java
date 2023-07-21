package spider;

public class typeCasting {
    public static void main(String[] args){
        //widening
//        byte b = 6;
//        float f= b;
//        System.out.println();
//        int i = 67;
//        double d = i;
//        System.out.println(d);
//        //narrowing
//        float ff= (float) 7.9;
        float ff= 7.8f;
        int i=  (int)ff;
        System.out.println(i);
        double d= 5.4545445445455d;
        float fff= (float) d;
        System.out.println(fff);
        long l= 7373737373l;
        int ii= (int) l;
        System.out.println(ii);
        int i2= 23433;
        short s= (short) i2;
        System.out.println(i2);
        double dd= 5.65656d;
        int y = (int) dd;
        System.out.println(y);
        double t= 2.333;
        long k = (int) t;
        System.out.println(k);
    }
}
