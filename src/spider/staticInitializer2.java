package spider;

public class staticInitializer2 {
    static {
        main(null); // we are calling main method with args which is mandatory to call
        //because in main method string with args is there
        System.out.println("Static Initializer2");
    }
    public static void main(String[] args){
        System.out.println("Main method");
    }
}
