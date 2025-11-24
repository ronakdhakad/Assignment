class This{
    
    This(int a){
        System.out.println("prameterized constructor called...");
    }

    This(){
        this(100);
        System.out.println("no argument constructor called...");
    }
}
class Main{
    public static void main(String args[]){
        This t =new This();
    }
}