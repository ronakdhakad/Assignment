/*28.Create a class BankAccount with one data member(balance).
Declare four methods
a)BankAccount() :- which initialize the member function with 0. 
b)void deposit(double amount) :- which adds balance in amount.
c)void withdraw(double amount) :- which deducts balance in amount.
d)double getBalance() :- which returns the balance.
Create a class SavingAccount with two data members(interest_rate and min_balance).

Declare a member function
a)	setInterestRate() :- which sets the interest and use the above methods to calculate the account balance.
*/
import java.util.Scanner;
class BankAccount {
    Scanner sc = new Scanner(System.in);
    protected double balance = 0;

    BankAccount() {
        balance = 0;
    }

    void deposit(double amount) {
        System.out.println("####DEPOSIT####");
        //System.out.print("Enter amount : ")
        if(amount>0)
            balance += amount;
        System.out.println("\nCurrent Balance : "+balance);
    }

    void withdraw(double amount) {
        System.out.println("####WITHDRAWL####");
        //System.out.print("Enter amount : ")
        if(amount<=balance&&amount>0)
            balance -= amount;
        System.out.println("\nCurrent Balance : "+balance);
    }

    double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    private float interest_rate;
    private float min_balance;

    SavingAccount(float min_balance) {
        this.min_balance = min_balance;
    }

    void setInterestRate() {
        System.out.println("Enter the Interes rate : ");
        interest_rate = sc.nextFloat();
        if (balance >= min_balance) {
            double interest = balance * (interest_rate / 100);
            deposit(interest); 
        }
    }
}
class TestMain {
    public static void main(String args[])
    {
        SavingAccount saving = new SavingAccount(1000);
        saving.setInterestRate();
        
    }
}
