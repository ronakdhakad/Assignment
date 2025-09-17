import java.util.Scanner;
class Student{
    int age;
    String name;
    void set(int age,String name){
        this.age=age;
        this.name=name;
    }
    
    Student(){
        this("name");
        System.out.println("-----------Constructor Called -----------");
    }
    Student(String name){
        this(name,21);
        System.out.println("Name:"+name);
    }
    Student(String name,int age){
        System.out.println("Name:"+name+" Age: "+age);
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

        Student s=new Student();
        s.set(age,name);
        
    }
}
