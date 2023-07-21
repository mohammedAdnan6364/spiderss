package Constructors;

public class BankAccount {
    long accNo;
    String AccHolderName;
    String branch;
    String ifscCode;

    BankAccount() {
        System.out.println("No argument Constructor");
    }

    BankAccount(long accNo, String AccHolderNAme, String branch, String ifscCode) {
        System.out.println("Parameterized Constructor");
        this.accNo = accNo;
        this.AccHolderName = AccHolderNAme;
        this.branch = branch;
        this.ifscCode = ifscCode;

    }

    public void details() {
        System.out.println("Account number =" + accNo);
        System.out.println("Account holder name= " + AccHolderName);
        System.out.println("Bank Branch Name =" + branch);
        System.out.println("IFSC Code = " + ifscCode);

    }
}
    class BankDriver{
        public static void main(String[] args){
            BankAccount b1= new BankAccount();
            System.out.println("|Account Holder 1|");
            b1.accNo= 234567;
            b1.AccHolderName="Abubakar";
            b1.branch="idbSandur";
            b1.ifscCode="00ysysyys";
            b1.details();
            System.out.println("|Account Holder 2|");

            BankAccount b2=new BankAccount( 252626,"Adnan","Bdvt","626ysysy");
            b2.details();

        }
    }

