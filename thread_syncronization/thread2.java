class Task extends Thread{
    synchronized void m1(){
        System.out.println("M1 method called");
    }
    synchronized void m2(){
        System.out.println("M2 method called");
    }
    void m3(){
        System.out.println("M3 method called "+Thread.currentThread().getName());
    }

    public void run(){
        if(Thread.currentThread().getName() == "Thread-0"){
            m1();
        }else if(Thread.currentThread().getName() == "Thread-1"){
            m2();
        }else{
            m3();
        }
    }
}
class Main{
    public static void main(String... args){
        Task t1 = new Task();
        Task t3 = new Task();
        Task t2 = new Task();
        t1.start();
        t2.start();
        t3.start();
    }
}