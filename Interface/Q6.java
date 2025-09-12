interface A{
    void b();
}
class Main{
    static int x=21;
    static void c(){
        System.out.println("void c"+x);
    }
    int y=22;
    void d(){
        System.out.println("void d"+y);
    }
    public static void main(String args[]){
        A o=()->{//anonmayas class
                c();
                Main ob=new Main();
                ob.d();
            };
            o.b();
    }
}