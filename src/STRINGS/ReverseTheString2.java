package STRINGS;

public class ReverseTheString2 {
    public static void main(String[] args) {
        String s = "MOHAMMED ADNAN";
        StringBuilder rev = new StringBuilder();// to avoid repeated creation of the objects by using this pbj class we created only once
        long start = System.nanoTime();
        for (int i=s.length()-1;i>=0;i--){// here as i = is s.length()-1 index will be starting from lasst of the  given string
            rev.append(s.charAt(i));// here for string builder append performs cancatenation
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(rev);
    }
}
