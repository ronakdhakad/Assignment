class Main {
    public static void main(String args[]){
        try{
            throw new ArithmeticException("Exception");
        }catch(Exception e){
            // System.exit(0);
            System.out.println(e);
        }

    }
    
}
