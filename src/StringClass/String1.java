package StringClass;

public class String1 {
    public static void main(String[] args){
        String s1 ="abc";
        String s2 = "abc";// here the address reference is been given to s2 from s1 becuz the content is same
        String s3 = new String(s2);// here type s3 will different block where the data has been stored
        System.out.println(s1==s2);
        System.out.println(s1==s2 && s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s3.hashCode());// to get reference code or address code

    }
}
