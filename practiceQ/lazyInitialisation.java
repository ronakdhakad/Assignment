class Account{
    int accNo;
    String name;
    private Account(){
    }
    
    static void display(int accNo){
        System.out.println("Acount No: "+accNo);
    }
}
    class Main{
    public static void main(String args[]){
        Account obj= new Account();
    }
    
}
