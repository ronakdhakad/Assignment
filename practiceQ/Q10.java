import java.util.Scanner;
class Account{
    int actNo;
    String actHolderName;
    Account(int actNo,String actHolderName){
        this.actNo=actNo;
        this.actHolderName=actHolderName;
    }
    void details(){
        System.out.println("Account No: "+actNo);
        System.out.println("Name : "+actHolderName);
    }
}
class Balance extends Account{
    int balance;
    Balance(int actNo,String actHolderName,int balance){
        super(actNo,actHolderName);
        this.balance=balance;
    }
    void bal(){
        System.out.println(" Total Balance : "+balance);
    }
}
class Transaction extends Balance{
    int wAmt;
    int dAmt;
    Transaction(int actNo,String actHolderName,int balance,int wAmt,int dAmt){
        super(actNo,actHolderName,balance);
        this.wAmt=wAmt;
        this.dAmt=dAmt;
    }
    void trans(){
        details();
        bal();
        System.out.println("Withdraw Amt: "+wAmt);
        int rem=balance-wAmt;
        System.out.println("After Withdraw Amt: "+rem);
        System.out.println("Diposite Amt: "+dAmt);
        rem=rem+dAmt;
        System.out.println("After Diposite Amt: "+rem);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter account no: ");
        int actNo=sc.nextInt();
        System.out.print("Enter name : ");
        String actHolderName=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter account balance: ");
        int balance=sc.nextInt();
        System.out.print("Enter withdraw Amt: ");
        int wAmt=sc.nextInt();
        System.out.print("Enter  diposite Amt: ");
        int dAmt=sc.nextInt();
        Transaction obj=new Transaction(actNo,actHolderName,balance,wAmt,dAmt);
        obj.trans();


    }
    
}
