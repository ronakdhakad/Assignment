/*45.Create a program that helps banks to maintain records. It should have following facilities.
o Anybody can create current or saving account with following initial information:account number, name, balance, and branch.
o display account detail for a particular accounts.
o display total money deposited in bank.
o allow deposit and withdrawal in an account .
o for saving account opening balance and minimum balance must be 5000.
o for current account opening balance and minimum balance must be 1000.
o can not withdraw the amount from the account that makes balance less than the minimum balance.
*/
import java.util.Scanner;
abstract class Program {
    Scanner sc = new Scanner(System.in);
    int accountNumber;
    String name;
    int balance;
    String branch;
    int totalDeposite;

    abstract void create();

    abstract void display();

    abstract void diposite();

    abstract void withdraw();

    void getInfo() {
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter Bank Branch : ");
        branch = sc.nextLine();
        System.out.print("Enter Account Number : ");
        accountNumber = sc.nextInt();
    }
}

class Current extends Program { 
    int deposit;
    int withdraw;
    int minimum;

    @Override
    void display() {
        System.out.println("\n\n##CURRENT ACCOUNT##");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Holder Name    : "+name);
        System.out.println("Bank Branch    : "+branch);
        System.out.println("Account Balance:  "+balance);
    }

    @Override
    void create(){
        System.out.println("##CURRENT ACCOUNT##");
        getInfo();
        while(true) {
            System.out.print("Enter minimum balance : ");
            balance = sc.nextInt();
            if(balance>1000)
                break;
            else
                System.out.println("Please maintail minimum balance..!!");
        }
    }
    
    @Override
    void diposite() {
        System.out.print("Enter Deposite Amout : ");
        deposit = sc.nextInt();
        totalDeposite += deposit;
        balance += deposit;
    }

    @Override
    void withdraw() {
        while(true){
            System.out.println("Enter Withdraw Amount : ");
            withdraw = sc.nextInt();
            if((balance-withdraw)>1000)
                break;
            else if((balance-withdraw)<0){
                System.out.println("Insufficient Balance..!!");
            }else
                System.out.println("Please maintain minimum balance");
        }    
    }
}

class Saving extends Program { 
    int deposit;
    int withdraw;
    int minimum; 

    @Override
    void display() {
        System.out.println("\n\n##SAVING ACCOUNT##");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Holder Name    : "+name);
        System.out.println("Bank Branch    : "+branch);
        System.out.println("Account Balance:  "+balance);
    }

    @Override
    void create(){
        System.out.println("##SAVING ACCOUNT##");
        getInfo();
        while(true) {
            System.out.print("Enter minimum balance : ");
            balance = sc.nextInt();
            if(balance>5000)
                break;
            else
                System.out.println("Please maintail minimum balance..!!");
        }
    }

    @Override
    void diposite() {
        System.out.print("Enter Deposite Amout : ");
        deposit = sc.nextInt();
        totalDeposite += deposit;
        balance += deposit;
    }

    @Override
    void withdraw() {
        while(true){
            System.out.println("Enter Withdraw Amount : ");
            withdraw = sc.nextInt();
            if((balance-withdraw)>5000)
                break;
            else if((balance-withdraw)<0){
                System.out.println("Insufficient Balance..!!");
            }else
                System.out.println("Please maintain minimum balance");
        }    
    }
}
 
class TestMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Program account;
        int n;

        //CREATE
        while(true){
            System.out.println("\nCreat an Account..");
            System.out.println("Enter Your Choice..");
            System.out.println("1.  Saving Account");
            System.out.println("2.  Current Account");
            n = sc.nextInt();
            int count= 0 ;
            switch(n){
                case 1 :account = new Saving();
                        account.create();
                        count++;
                        break;
                case 2 :account = new Current();
                        account.create();
                        count++;
                        break;
                default:System.out.println("Invalid Input..!!");
                        account= null;
                        break;
            }
            if(count>0)
                break;
        }
        System.out.println();
        //DIAPLAY ACCOUNT
        account.display();

        //DEPOSITE WITHDRAWL
        System.out.println("\nEnter Your Choice..");
        System.out.println("1.  Deposite");
        System.out.println("2.  Withdrawl");
        n = sc.nextInt();
        switch(n){
            case 1 : account.diposite();
                    break;
            case 2 :account.withdraw();
                    break;
            default:System.out.println("Invalid Input..!!");
                    break;
        }

        //TOTAL DEPOSITE
        System.out.println("\n\nTotal Deposite Amount : "+account.totalDeposite);

    }
}