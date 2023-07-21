package Composition;

 public class Movie {
    String moviename;
    int budget;
    actor a = new actor();
}
class actor{
    String actorName;
    int  actorFees;

}
class MovieDriver{
     public static void main(String[] args){
         Movie m = new Movie();
         m.moviename= "Pathan";
         m.budget=2000000000;
         m.a.actorName="SRK";
         m.a.actorFees=250000000;
         System.out.println(m.moviename);
         System.out.println(m.budget);
         System.out.println(m.a.actorName);
         System.out.println(m.a.actorFees);

     }

}
