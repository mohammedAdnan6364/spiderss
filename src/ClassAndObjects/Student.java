package ClassAndObjects;

public class Student {
    int id;
    String name;
    String email;
   static String InsituteName = "JSpiders";// static beause every student having same institute

}
class StudentFactory{
    public static void main(String[] args){
        Student s1= new Student();
        s1.id= 1;
        s1.name="Adnan";
        s1.email="Adnan.gmail.com";
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.email);
        System.out.println(s1.InsituteName);
        Student s2 = new Student();
        s2.id=2;
        s2.name="Adn";
        s2.email="adn.gmail.com";
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.email);
        System.out.println(s2.InsituteName);
    }
}
