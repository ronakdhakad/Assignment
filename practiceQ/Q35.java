class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
    void ge() throws MyException{
        throw new MyException(" Genrete custom exception through checked exception:");
    }
    
}
class Main{
    public static void main(String args[]) throws MyException{
        MyException m=new MyException("my msg");
        // try{
            m.ge();
        // }catch(Exception e){
        //     System.out.println("exception genereted ");
        // }
    }
}
