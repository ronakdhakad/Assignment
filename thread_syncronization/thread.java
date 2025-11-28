class Task extends Thread{    
    synchronized void m1(){
        System.out.println("M1 mathod called");
    }
    synchronized void m2(){
        System.out.println("M2 mathod called");
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        if(Thread.currentThread().getName() == "Thread-0"){
            m1();
        }
        else
            m2();
    }
}
class Main{
    public static void main(String... args){
        Task t1 = new Task();
        Task t2 = new Task();
        t1.start();
        t2.start();
    }
}