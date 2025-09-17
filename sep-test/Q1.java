import java.util.Scanner;
class Parent{
    void show(){
        System.out.println("Parent method called-----");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child method called--------");
    }

    int cage;
    String cname;
    void details(int age,String name){
        this.cage=age;
        this.cname=name;
    }
    void display(){
        System.out.println("Name: "+cname+"\n Age: "+cage);
    }
}
class Main{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name=sc.nextLine();

        Parent obj=new Child();
        obj.show();// upcasting ...

        Child cobj=new Child();
        cobj.details(age,name);
        cobj.display();


        Parent pobj=new Parent();
        pobj.show();
    }
}