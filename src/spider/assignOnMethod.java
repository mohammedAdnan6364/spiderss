package spider;

public class assignOnMethod {
    public static void main(String [] args){
        System.out.println(E1(4));
        System.out.println(e2("Adnann"));
        System.out.println(e3());
        System.out.println(""+e4(3.44,3.432));
        System.out.println(e5());

    }
    public static String E1(int n){
        if (n%2==0){
            return "Even";
        }else
        {
            return "even";
        }
    }
    public static boolean e2(String  s){
        if (s == "Adnan"){
            return true;
        }else {
            return false;
        }
    }
    public static float e3( ){

        return 3.5f+3.22f;
    }
    public static double e4(double a,double b){
        return a+b;
    }
    public static byte e5(){
        System.out.println((byte)567);
        return (byte) ((byte) 1+234);

    }


}
