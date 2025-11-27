interface Showable{
    void display();
}

class Demo1 implements Showable{
    Demo1(){
        display();
        System.out.println("display method called...");
    }
    @Override
    public void display(){
        System.out.println("hello user...");
    }
}
public class Main{
    public static void main(String args[]) {

        Showable sobj= Demo1::new;

        sobj.display();

    }   
}