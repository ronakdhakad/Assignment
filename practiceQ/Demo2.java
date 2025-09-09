interface anonomyas{
    int age =21;
    void detail();
}
abstract class Demo{
    int age =21;
    abstract void show();
}
class Main extends Demo implements anonomyas{
    @Override
    public void detail(){
        System.out.println("method called");
    }
    @Override
    public void show(){
        System.out.println("show called");
    }
    public static void main(String args[]){
        Main obj=new Main();
        obj.detail();
        obj.show();
        new Main().show();

    }
}
