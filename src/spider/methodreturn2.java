package spider;

public class methodreturn2 {
    public static void main(String [] args){
        boolean res= Checkeven(66);
        if(res){
            System.out.println("evenn");
        }else {
            System.out.println("odd");
        }
        //System.out.println(Checkeven(9));

    }
    public static boolean Checkeven(int n){ // here in arguments the n value is been taken
        if (n%2==0){
            return true;
        }else {
            return false;  // return a%2==0?true:false;-----
        }
        //return n%2==0? true:false;------> short cut
    }
}
