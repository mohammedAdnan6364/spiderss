package arrayCoreJava;

public class student {
    int id;
    String name;
    long phone;

    public student(int id,String  name, long phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
    public String toString(){// we are  using this because if we not use this we will only get address not content so by using to string class we can get the array and here this keyword is optional
        return " id = "+this.id+
                " Name = "+this.name+
                " phone No = "+this.phone;
    }

}
