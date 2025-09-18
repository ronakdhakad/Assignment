class Run extends Exception{

    Run(String msg){
        super(msg);
        System.out.println(msg);
    }

    void Exp()throws Run{
    throw new Run("exception genreted...");
    }

    
}class Main{
    public static void main(String args[]){
        Run o=new Run("new genereted.......");

        o.Exp();

}
}
