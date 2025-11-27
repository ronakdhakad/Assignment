class First extends Thread{
    A aobj;
    B bobj;
    First(A aobj,B bobj){
        this.aobj=aobj;
        this.bobj=bobj;
    }
    public void run(){
        aobj.m1(bobj);
    }
}
class Second extends Thread{
    A aobj;
    B bobj;
    Second(A aobj,B bobj){
        this.aobj=aobj;
        this.bobj=bobj;
    }
     public void run(){
        bobj.p1(aobj);
    }
}
class A{
    synchronized void m1(B bobj){
        System.out.println("Method m1 from class A");
        bobj.p2();
    }
    synchronized  void m2(){
        System.out.println("Method m2 from class A");
    }
}
class B{
    synchronized  void p1(A aobj){
        System.out.println("Method p1 from class B");
        aobj.m2();

    }
    synchronized  void p2(){
        System.out.println("Method p2 from class B");
    }
}
class DeadLock {
    public static void main(String[] args) {
        A aobj=new A();
        B bobj=new B();

        First t1=new First(aobj,bobj);
        Second t2=new Second(aobj,bobj);

        t1.start();
        t2.start();

    }    
}
