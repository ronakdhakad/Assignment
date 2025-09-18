class Main{
    public static void main(String args[]){
    
        try{
            throw new ArithmeticException("Exception created...");
        }catch(ArithmeticException e){
            System.out.println(e);
            
        }
        finally{
            System.out.println("Exception Handling Executed ....2");
        }
    }
    
}
