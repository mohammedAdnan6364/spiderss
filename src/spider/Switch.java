package spider;

public class Switch {
    public static void main(String[] args){
        int n= 5;
        switch (n) {
            case 1: {
                System.out.println("Case1 got executed ");
                System.out.println("----------------------");
            }
            break;
            case 2: {
                System.out.println("CAse2 got executed");
                System.out.println("----------------------");
            }
            break;
            case 3: {
                System.out.println("CAse3 got executed");
                System.out.println("----------------------");
            }
            break;
            default:{
                System.out.println("none of case executes ");
                System.out.println("----------------------");
            }
        }
    }
}
