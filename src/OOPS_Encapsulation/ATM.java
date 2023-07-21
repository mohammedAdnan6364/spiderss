package OOPS_Encapsulation;

import java.util.Scanner;

public class ATM {

        private int pin;
        private String Accno,Accname;
        private double Accbal,amt=0;


        public void createAcc()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("------------------------------");
            System.out.println("|     Enter Account Details   |");
            System.out.println("------------------------------");
            System.out.print("Enter Accno : ");
            Accno = input.nextLine();
            System.out.print("Enter Accname : ");
            Accname = input.nextLine();
            System.out.print("Enter Deposite Amount : ");
            Accbal = input.nextDouble();
            System.out.print("Enter your pin : ");
            pin = input.nextInt();
            System.out.println("------------------------------");
            System.out.println("| Acc Created SuccessFully ! |");
            System.out.println("------------------------------");
            menu();

        }

        public void deleteAcc()
        {
            this.Accno = null;
            this.Accbal = 0;
            this.pin = 0;
            this.Accname = null;
        }

        public void addMoney(double amt) {
            this.Accbal+=amt;
            System.out.println(amt+" Added Successfully !");
        }

        public void withdrawMoney(double amt)
        {
            this.Accbal-=amt;
            System.out.println(amt+" Withdraw Successfully !");
        }

        public void Accbalance()
        {
            System.out.println("---------------------------");
            System.out.println("Your account balance is "+this.Accbal);
            System.out.println("---------------------------");
        }

        public void Auth()
        {
            if(Accname == null)
            {
                System.out.println("Account does not Exist !");
                System.out.println("Please create an account...");
                menu();
            }
            else
            {
                int apin;
                Scanner input = new Scanner(System.in);
                System.out.println("---  ATM   ---");
                System.out.println();
                System.out.print("Enter the PIN : ");
                apin = input.nextInt();

                if(this.pin == apin)
                {
                    System.out.println("Access Granted !");
                    Accmenu();
                }
                else
                {
                    System.out.println("Access Denied !");
                    Auth();
                }
            }
        }

        public void Accdetails()
        {
            System.out.println("------------------------------");
            System.out.println("|         Acc Details        |");
            System.out.println("------------------------------");
            System.out.println(" Account Number    : "+Accno+" ");
            System.out.println(" Account Name    : "+Accname+" ");
            System.out.println(" Account Balance : "+Accbal+" ");
            System.out.println(" Account Pin     : "+pin+" ");
            System.out.println("------------------------------");
        }

        public void menu()
        {
            int choice;
            char ch;
            Scanner input = new Scanner(System.in);
            System.out.println("------------------");
            System.out.println("       ATM        ");
            System.out.println("------------------");
            System.out.println("|   1 Create Acc |");
            System.out.println("|   2 Acc login  |");
            System.out.println("|   3 Exit       |");
            System.out.println("------------------");
            System.out.print("Enter your Choice : ");
            choice = input.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    createAcc();
                    break;

                case 2:Auth();
                    break;


                case 3:System.out.print("Do you want to try again ? y-yes / n-no : ");
                    ch = input.next().charAt(0);
                    if(ch == 'y'|| ch == 'Y')
                    {
                        System.out.print("System Exit !");
                        System.exit(0);
                    }
                    else
                    {

                        menu();
                    }
                    break;

                default:System.out.println(" Invalid Choice !");
                    menu();
                    break;
            }



        }

        public void Accmenu()
        {
            int choice;
            double amt;
            System.out.println("------------------------");
            System.out.println("-------- ACC Menu ------");
            System.out.println("------------------------");
            System.out.println("| 1 Check Balance      |");
            System.out.println("| 2 Withdraw Amount    |");
            System.out.println("| 3 Deposite Amount    |");
            System.out.println("| 4 Account Details    |");
            System.out.println("| 5 log out            |");
            System.out.println("------------------------");
            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:Accbalance();
                    Accmenu();
                    break;

                case 2:System.out.print("Enter amount to be withdraw : ");
                    amt = input.nextDouble();
                    withdrawMoney(amt);
                    Accmenu();
                    break;

                case 3:System.out.print("Enter amount to be added : ");
                    amt = input.nextDouble();
                    addMoney(amt);
                    Accmenu();
                    break;

                case 4:Accdetails();
                    Accmenu();
                    break;

                case 5:System.out.println("Logout Successfull !");
                    menu();
                    break;

                default:System.out.println(" Invalid Choice ! ");
                    break;
            }
        }

    }

class AtmMaker {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.menu();
    }
}

