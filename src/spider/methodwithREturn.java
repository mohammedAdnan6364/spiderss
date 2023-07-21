package spider;

public class methodwithREturn {
    public static void main(String[] args){
        System.out.println("method with return type");
      int  res=  add(78,9);
        System.out.println(res);
        System.out.println(add(6,9));
    }
    public static int add(int a, int b){
        return a+b;
    }
}
