package spider;

 class StaticIniWithMultipleClass {
     static {
      System.out.println("Static initializer from 1");
     }
     static  int x=30;
}
class q{
  static {
   System.out.println("Static initializer from q");
  }
  static int y=60;
}
class r{
  static {
   System.out.println("Static initializer from r");
  }
  public static void main(String[] args){
   System.out.println(StaticIniWithMultipleClass.x);// here static block will execute when we can a block
   // in a sout as given above
   System.out.println(q.y);// here y class will be executed
  }
}
