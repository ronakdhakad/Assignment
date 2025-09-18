class Run extends Exception{

    Run(String msg){
        super(msg);
        System.out.println(msg);
    }

    void Exp()throws Run{
    throw new Run("exception genereted...");
    }

    
}class Main{
    public static void main(String args[]){
    Run o=new Run("new genereted.......");

    try{
        o.Exp();
    }catch(Exception e){
        System.out.println("Exception");
    }
    finally{
        System.out.println("End.....");
    }
}
}
