class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
    void ge(){
    throw new MyException("unchecked exception ");
} 
}
class Main{
    public static void main(String args[]){
        MyException m=new MyException("message");
        m.ge();
    }
}