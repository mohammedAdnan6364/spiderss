package spider;

public class nestedIf {
    public static void main(String[] args){
        int a= 6;
        if(a%2 ==0){
            System.out.println("Even number");
            if(a<10){
                System.out.println(" and single digit");
            }else {
                System.out.println(" and more than one digit");
            }
        }

    }
}
