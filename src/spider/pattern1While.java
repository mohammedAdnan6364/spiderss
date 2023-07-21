package spider;

public class pattern1While {
    public static void main(String[] args){
        int j=0;
        while (j<5){
            int i=0;
            while (i<5){
                System.out.print("*");
                i++;
            }
            System.out.println();
            j++;
        }
    }
}
