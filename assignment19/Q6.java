import java.util.Scanner;
class Bank{
    Scanner sc=new Scanner(System.in);
    int wamt=0,damt=0;

    class Account{
        int accNo;
        String name;
        int bal=0;       
            void addAcc(){
                System.out.print("Account Number: ");
                accNo=sc.nextInt();
                sc.nextLine();
                System.out.print("Account Holder Name: ");
                name=sc.nextLine();
                System.out.print("Balance: ");
                bal=sc.nextInt();
            }
    }
    void transaction(){
        System.out.print("Do you want to- Withdraw press (1) or Deposite press (2) : ");
        int press =sc.nextInt();
        if(press==2){
            System.out.print("Enter deposite Amount : ");
            damt=sc.nextInt();
            aobj.bal=aobj.bal-damt;
        }
        if(press==1){
            System.out.print("Enter withdraw Amount : ");
            wamt=sc.nextInt();
            aobj.bal=aobj.bal-wamt;
        }
    }
    Account aobj = new Account();
    void display(){
        System.out.print("Account Holder Number: "+aobj.accNo+"\n");
        System.out.print("Holder Name: "+aobj.name+"\n");
        System.out.print("Balance: "+aobj.bal+"\n");
        System.out.println();
    }
    int i=1;
    void transDisplay(){
        int i=1;
        System.out.println("-- Account Transaction -- ");
        System.out.println(i+". Account "+aobj.accNo+" created");
        System.out.println((i+1)+". $"+damt+" deposited");
        System.out.println((i+2)+". $"+damt+" withdrew");
        System.out.println();
    }
    void summary(){
        System.out.println(i+". Account  -- "+aobj.accNo);
        i++;
        System.out.println();
    }
    static class AuditTrail{
        Bank bobj1= new Bank();
        int i=1;
        void logTrans(){
            bobj1.transDisplay();
            System.out.println();
        }
        void summary(){
            bobj1.summary();
            System.out.println();
        }
    }
    public static void main(String args[]){
        Bank bobj[] = new Bank[2];
        Bank bobj1= new Bank();
        Account aobj[] = new Account[2];
        // Account aobj1 = new Account();

        for(int i=0;i<aobj.length;i++){
            aobj[i]=bobj1.new Account();
            aobj[i].addAcc();
            bobj[i]=new Bank();
            bobj[i].transaction();
            System.out.println();
        }

        for(Bank b:bobj){
            b.display();
            System.out.println();
            AuditTrail aobj2=new AuditTrail();
            // for(int i=0;i<aobj.length;i++){
                aobj2.logTrans();
                System.out.println();
            // }
        }
    }
}