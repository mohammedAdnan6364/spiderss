package MultipleClasses;

class Z {
    public static void main(String [] args){
        System.out.println(x.a);
        System.out.println(Y.b);
        x.a=78;
        Y.b=77;
        System.out.println(x.a);
        System.out.println(Y.b);
    }
}
