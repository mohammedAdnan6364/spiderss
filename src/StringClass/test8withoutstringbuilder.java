package StringClass;

public class test8withoutstringbuilder {
    public static void main(String[] args){
        String s="";
        long start= System.nanoTime();
        for (char ch='a';ch<='z';ch++){
            s+=ch;
        }
        long end= System.nanoTime();
        System.out.println(end-start);
        System.out.println(s);
    }
}
