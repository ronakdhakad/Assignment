// Bank Account
// Create a class BankAccount with fields: accountNumber, holderName, balance.
// Use setters to assign values. Add a method to display balance.
public class BankAccount{
    private int accountNumber;
    private String holderName;
    private int balance;
    public void setDetail(int accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void getDetail(){
        System.out.println("Bank Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Account Balance: "+balance);
    }
}
class Main{
    public static void main(String args[]){
        BankAccount BA=new BankAccount();
        BA.setDetail(3244345,"Atul",250000);
        BA.getDetail();
    }
}
