import java.util.Scanner;
class Account
{
    Scanner sc = new Scanner(System.in);
    private int accno;
    private String name;
    private float balance;

    void getData()
    {
        System.out.print("Enter Account Number : ");
        accno = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Holder Name : ");
        name = sc.nextLine();
        System.out.print("Enter Account Balance : ");
        balance = sc.nextFloat();
    }
    void deposite()
    {
        System.out.print("\nEnter Deposite Amoutn : ");
        float deposite = sc.nextFloat();
        balance += deposite;
    }
    void withdraw()
    {
        System.out.print("\nEnter Withdraw Amount : ");
        float withdraw = sc.nextFloat();
        balance -= withdraw;
    }
    void display()
    {
        System.out.println("\nAccount No       : "+accno);
        System.out.println("Holder Name      : "+name);
        System.out.println("Account Balance  : "+balance);
    }

    public static void main(String args[])
    {
        Account obj = new Account();

        obj.getData();
        obj.deposite();
        obj.withdraw();
        obj.display();
    }
}