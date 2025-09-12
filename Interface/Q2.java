import java.util.Scanner;
interface D{
    void show(int age,String name);
}
class Demo implements D{
    int age;
    String name;
    @Override
    public void show(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("Age: "+age+" Name: "+name);
    }
}
class Main{
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        
        D obj=new Demo();
        obj.show(age,name);
    }
}