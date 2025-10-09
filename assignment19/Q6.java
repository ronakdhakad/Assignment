import java.util.Scanner;
class Bank{
    int accNo;
    String name;
    int bal=0; 

    Scanner sc=new Scanner(System.in);
    int wamt=0,damt=0;

    class Account{
        void addAcc(){
            System.out.print("Account Number: ");
            accNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Account Holder Name: ");
            name=sc.nextLine();
            System.out.print("Balance: ");
            bal=sc.nextInt();
        }

    void transaction(){
        System.out.print("Do you want to- Withdraw press (1): ");
        int press =sc.nextInt();
        if(press==1){
            System.out.print("Enter deposite Amount : ");
            damt=sc.nextInt();
            bal=bal-damt;
        }
        System.out.print("Do you want to- Deposite press (2) : ");
        press =sc.nextInt();
        if(press==2){
            System.out.print("Enter withdraw Amount : ");
            wamt=sc.nextInt();
            bal=bal-wamt;
        }
    }
        void display(){
            System.out.print("Account Holder Number: "+accNo+"\n");
            System.out.print("Holder Name: "+name+"\n");
            System.out.print("Balance: "+bal+"\n");
            System.out.println();
        }
        int i=1;
        void transDisplay(){
            System.out.println("-- Account Transaction -- ");
            System.out.println(i+". Account "+accNo+" created");
            System.out.println((i+1)+". $"+damt+" deposited");
            System.out.println((i+2)+". $"+damt+" withdrew");
            System.out.println();
        }
        void summary(){
            System.out.println(i+". Account  -- "+accNo);
            i++;
            System.out.println();
        }
    }
    static class AuditTrail{
        Bank bobj= new Bank();
        Account aobj = bobj.new Account();
        int i=1;
        void logTrans(){
            aobj.transDisplay();
            System.out.println();
        }
        void summary(){
            aobj.summary();
            System.out.println();
        }
    }
}
class Main extends Bank{
    public static void main(String args[]){
        Bank bobj[]= new Bank[2];
        Bank bobj1= new Bank();
        Account aobj[] = new Account[2];
    
        for(int i=0;i<bobj.length;i++){
            bobj[i]=new Bank();
            aobj[i]=bobj1.new Account();
            aobj[i].addAcc();
            bobj[i]=new Bank();
            // bobj[i].transaction();
            System.out.println();
        }
    
        for(Bank b:bobj){
            // b.display();
            System.out.println();
            AuditTrail aobj2=new AuditTrail();
                aobj2.logTrans();
                // System.out.println();
         }
         for(Account a:aobj){
            a.display();
         }
    }
}