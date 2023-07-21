package spider;

public class Switch3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        char ch = '/';
        int res=0;
        switch (ch) {
            case '+': {
                 res = a + b;
                System.out.println("Addition =" + res);
            }
            break;
            case '-': {
                res = a - b;
                System.out.println("Sub =" + res);

            }
            break;
            case '/': {
                res = a/b;
                System.out.println("Div =" + res);
            }
            break;
            case '%': {
                res = a%b;
                System.out.println("Mod =" +res);
            }
            break;
            default:{
                System.out.println("Please enter appropriate operator");
            }
        }
    }

}
