package ClassAndObjects;

 class NonStaticMultiLine {
     static {
         System.out.println("Static Initializer");
     }
    {
        System.out.println("NOn Static Initializer 1");
    }
    {
        System.out.println("Non Static Initializer 2");
    }
    public static void main(String[] args){
        NonStaticMultiLine obj1 = new NonStaticMultiLine();
        NonStaticMultiLine obj2 = new NonStaticMultiLine();
        NonStaticMultiLine obj3 = new NonStaticMultiLine();

    }
}
