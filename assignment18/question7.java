import java.util.Scanner;
class Account
{
    Scanner sc = new Scanner(System.in);
    private int accno;
    private String name;
    private float balance;
    private float deposite;
    private float withdraw;

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
        deposite = sc.nextFloat();
        balance += deposite;
    }
    void withdraw()
    {
        boolean temp = true;
        while(temp){
            System.out.print("Enter Withdraw Amount : ");
            withdraw = sc.nextFloat();
            if(balance<withdraw)
                System.out.println("Insufficient Account Balance\nPlease re-enter..!!\n");
            else{
                balance -= withdraw;
                temp = false;
            }
        }
    }
    void display()
    {
        System.out.println("\nAccount No       : "+accno);
        System.out.println("Holder Name      : "+name);
        System.out.println("Account Balance  : "+balance);
    }
    float totalDeposite(){
        return deposite;
    }
    float getBalance(){
        return balance;
    }
    int getAcNo(){
        return accno;
    }
}
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Account objarry[] = new Account[6];

        //GETING 6 USER'S DETAIL'S
        for(int i=0 ; i<objarry.length ; i++)
        {
            System.out.println("\n=+= "+(i+1)+" User Detail's =+=");
            objarry[i] = new Account();
            objarry[i].getData();
        }

        //ASKING USER TO DEPOSITE MONEY
        for(int i=0 ; i<objarry.length ; i++)
        {
            System.out.println("\nACCOUNT "+objarry[i].getAcNo()+" DO YOU WANT TO DEPOSITE(Y/N)");
            char choice = sc.next().toUpperCase().charAt(0);
            if(choice=='Y'){
                objarry[i].deposite();
            }else{
                System.out.println("Thank you for using our Services!!\n");
            }
        }


        //DISPLAY TOTAL DEPOSITE ACCOUNT
        int total=0;
        for(int i=0 ; i<objarry.length ; i++)
        {
            total += objarry[i].totalDeposite();
        }
        System.out.println("\n##TOTAL DEPOSITE BALANCE IN ALL ACCOUNT##\n\tBALANCE   :   "+total+"\n");

        System.out.println("***LIST OF ACCOUNT NUMBER WHICH HAVE MORE THAN 1000 BALANCE***");
        for(int i=0 ; i<objarry.length ; i++)
        {
            if(objarry[i].getBalance()>1000)
                System.out.println("\t  "+objarry[i].getAcNo());
        }
    }
}