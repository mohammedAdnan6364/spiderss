package arrayCoreJava;

public class StudentArray {// non primitive array
    public static void main(String[] args){
        student[] arr=new student[3];
        arr[0]=new student(1,"Adnan",8787878);
        arr[1]=new student(1,"Adn",878787890);
        arr[2]=new student(1,"Adnan",878878000);
        for (student x: arr){
            System.out.println(x);
            //if we are not using tostring override method
            // s.o.p(x.id)
            //s.o.p(x.name).... like this we have to write to get the content
        }
    }
}
