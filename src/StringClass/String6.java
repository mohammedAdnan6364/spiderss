package StringClass;

public class String6 {
    public static void main(String[] args ){
        String s = "abcabccab ";
        System.out.println(s.indexOf('a',4));
        System.out.println(s.lastIndexOf('c'));
        String s2= "";
        System.out.println(s2.isEmpty());
        System.out.println(s.lastIndexOf('a',4));
        System.out.println(s.replace('a','z'));
        System.out.println(s.replaceAll("ab","ee"));
        String s3 = s.trim();
        System.out.println(s.length());
        System.out.println(s3.length());

        // static valueof methods
        String temp=String.valueOf(false);
        String temp1= String.valueOf(9.828);
        System.out.println(temp);
        System.out.println(temp1);

        System.out.println(s.substring(0,4));
    }
}
