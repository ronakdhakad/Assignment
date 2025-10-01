import java.util.Scanner;
class Bank{
    int bal;
    Bank(int bal){
        this.bal=bal;
    }
    Scanner sc =new Scanner(System.in);
    void withdraw() throws InsufficientBalance{
        System.out.println("Enter Withdraw Amt:");
        int wamt=sc.nextInt();
        if(wamt>bal){
            throw new InsufficientBalance("Insufficient Balance");
        }else{
            System.out.println("Balance: "+bal);
            System.out.println("Wthdraw Amount: "+wamt);
            System.out.println("Remaining Balance: "+(bal-wamt));
        }
}
}
class InsufficientBalance extends Exception{
    InsufficientBalance(String msg){
        super(msg);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Balance:");
        int bal=sc.nextInt();
        Bank bobj=new Bank(bal);
        try{
            bobj.withdraw();
        }catch(Exception e){
        System.out.println("Exception: "+e.getMessage());
    }finally{
        System.out.println("Program executed succesfully");
    }

    }
}
