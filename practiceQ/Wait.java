class Bank{
    String name;
    int bal;
    Bank(String name,int bal){
        this.name=name;
        this.bal=bal;
    }
    synchronized void withdraw(int wamt){
        try{ 
            if(wamt>bal){
                System.out.println("Low balance waiting for deposite");
                wait();
                System.out.println("Current balance : "+bal);
                System.out.println("Withdraw  amount : "+wamt);
                System.out.println("After Withdraw   : "+(bal-wamt));
            }
    
            this.bal-=wamt;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
    synchronized void deposite(int damt){
        System.out.println("Current balance : "+bal);
        System.out.println("Deposite  amount : "+damt);
        System.out.println("After deposite   : "+(bal+damt));
        this.bal+=damt;
        notify();
    }
}
class Wait {
    public static void main(String args[]){
        int bal=10000;
        String name="Andrew Anderson";
        int wamt=100000;
        int damt=1000;
        Bank cu=new Bank(name,bal);

        Thread th=new Thread(()->{cu.withdraw(wamt);});
        th.start();
        // cu.withdraw(wamt);
        if(wamt>bal){
            Thread th1=new Thread(){
                @Override
                public void run(){
                cu.deposite(damt);
                }
            };
            th1.start();
        }

    }    
}
