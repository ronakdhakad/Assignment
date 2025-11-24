class This{
    void show(){
        System.out.println("show method called...");
    }
    void display(){
        show(); //implicitly the show method use "this" keyword.
        this.show(); 
    }
}
class Main{
    public static void main(String args[]){
        This t =new This();
        t.display();
    }
}