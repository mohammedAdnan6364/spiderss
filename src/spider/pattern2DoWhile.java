package spider;

public class pattern2DoWhile {
    public static void main(String[] args){
        int i=0;
        do {
            int j=0;
            do {
                System.out.print(" * ");
                j++;
            }while (j<5);
            System.out.println();
            i++;
        }while(i<5);
    }
}
