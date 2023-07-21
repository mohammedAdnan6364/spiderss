package spider;

public class Switch2 {
    public static void main(String[] args) {
        char ch = 'r';
        switch (ch) {
//            case 'a': {
//                System.out.println("it is a vowel " );
//                System.out.println("----------------------");
//            }
//            break;
//            case 'e': {
//                System.out.println("it is a vowel");
//                System.out.println("----------------------");
//            }
//            break;
//            case 'i': {
//                System.out.println("it is a vowel");
//                System.out.println("----------------------");
//            }
//            break;
//            case 'o': {
//                System.out.println("it is a vowel");
//                System.out.println("----------------------");
//            }
//            break;
//            case 'u': {
//                System.out.println("it is a vowel");
//                System.out.println("----------------------");
//            }break;
//            default:{
//                System.out.println("its a consonant ");
//                System.out.println("----------------------");
//            }
//        }
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':{
                System.out.println("its a vowel");
            }break;
            default:{
                System.out.println("its a consonent");
            }
        }
    }
}

