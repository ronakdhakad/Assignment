class This{
    int a;
    void show(int a){
        this.a=a;
        System.out.println("show: "+a);
    }
    void display(){
        System.out.println("display: "+a);
    }
}
class Main{
    public static void main(String args[]){
        This t =new This();
        t.show(10);
        t.display();
    }
}