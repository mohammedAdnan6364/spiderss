package STRINGS;

public class removeSpaces {
    public static void main(String[] args){
        String s ="a b c  d  e";
        System.out.println(s.replaceAll("\\s",""));
    }
}
