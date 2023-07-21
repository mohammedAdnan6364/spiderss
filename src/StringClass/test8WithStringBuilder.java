package StringClass;

public class test8WithStringBuilder {
    public static void main(String[] args){
        StringBuilder s= new StringBuilder();
        long start= System.nanoTime();
        for (char ch='a';ch<='z';ch++){
            s.append(ch);
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(s);

    }
}
