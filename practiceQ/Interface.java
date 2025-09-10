interface Show{
    int age =10;
    void show();
}
abstract class Print implements Show{
    @Override
    abstract void print();

}
class Display extends Print{
    @Override
    public void print(){
        System.out.println("display mehtod of class Display");
    }
}
class Main{

    
    public static void main(String args[]){

    }

}