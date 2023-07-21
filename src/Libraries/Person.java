package Libraries;

public class Person {
    int id;
    String  name;
    long phone;

    public Person(int id, String  name, long phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
   public String toString(){
        return id+" "+name+" "+phone;
   }
}
