package OOPS_Encapsulation;

public class Employeee {
    private int id;
    private String name;
    private  String email;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getName(){
        return  name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
class EmployeeDriver{
    public static void main(String[] args){
        Employeee e1 = new Employeee();
        e1.setId(1);
        e1.setName("Adnan");
        e1.setEmail("adnan.210201@gmail.com");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getEmail());
    }
}
