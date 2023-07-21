package StringClass;

import javax.naming.PartialResultException;

public class String4 {
    public static void main(String[] args){
        String s= "adnan";
        System.out.println(s.length());
       // System.out.println(s.charAt(2));
        for (int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

    }
}
