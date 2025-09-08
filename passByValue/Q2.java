// example

class Main{
    
    int a=100; // instance variable

    public static void main(String args[]){
        Main obj1 = new Main();
        System.out.println("value of a(obj1) : "+obj1.a);
        obj1.a += 100;
        System.out.println("value of a(obj1) : "+obj1.a);
        
        Main obj2 = new Main();
        System.out.println("value of a(obj2) : "+obj2.a);
        
    }
}