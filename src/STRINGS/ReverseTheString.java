package STRINGS;

public class ReverseTheString {
    public static void main(String[] args) {
        String s = "MOHAMMED ADNAN";
        String rev ="";
        long start = System.nanoTime();
        for (int i=s.length()-1;i>=0;i--){// here as i = is s.length()-1 index will be starting from lasst of the  given string
            rev += s.charAt(i);// here concatenation is happening!!!
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(rev);
    }
}

