package Arrays;

import java.util.Scanner;

public class ArrayOfAllOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0 ; i< arr.length;i++){
            System.out.println("Enter the "+(i+1)+" value=");
            arr[i]= sc.nextInt();
        }
        boolean b = true;
        while (b){
            System.out.println("| Enter your Choice  |");
            System.out.println("------------------------------------");
            System.out.println("| 1.Sum of Array Elements          |");
            System.out.println("| 2.Product of Array Elements      |");
            System.out.println("| 3.sum  of even  Array Elements   |");
            System.out.println("| 4.product of even Array Elements |");
            System.out.println("| 5.Sum of odd Array Elements      |");
            System.out.println("| 6.product of odd Array Elements  |");
            System.out.println("| 7.Exit                           |");
            System.out.println("------------------------------------");
            int nn = sc.nextInt();

            switch (nn){
                case  1 : {
                    int sum = 0;
                    for(int x : arr){
                        sum += x;
                    }
                    System.out.println("Sum of Array elements = "+sum);
                }break;
                case 2 :{
                    int prod =1;
                    for (int x : arr ){
                        prod *=x;
                    }
                    System.out.println("Product Of Array Elements  ="+prod);
                }break;
                case 3 :{
                    int EvenSum = 0;
                    for(int x : arr){
                        if (x%2==0) {
                            EvenSum += x;
                        }
                    }
                    System.out.println("Sum of  even Array elements = "+EvenSum);

                }break;
                case 4 :{
                    int evenProd = 1;
                    for (int x : arr){
                        if (x%2==0){
                            evenProd *=x;
                        }
                    }
                    System.out.println("product of Even Array Elements ="+evenProd);
                }break;
                case 5 :{
                    int oddSum = 0;
                    for(int x : arr){
                        if (x%2!=0) {
                            oddSum += x;
                        }
                    }
                    System.out.println("Sum of  even Array elements = "+oddSum);
                }break;
                case 6 :{
                    int oddProd = 1;
                    for (int x : arr){
                        if (x%2!=0){
                            oddProd *=x;
                        }
                    }
                    System.out.println("product of Even Array Elements ="+oddProd);
                }break;
                case 7 :{
                    b=false;
                    System.out.println("Thank You");
                }break;
                default:{
                    System.out.println("Please Enter Correct Choice.......");
                }
            }

        }

    }
}
