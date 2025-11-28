class Task extends Thread{
     synchronized void m1(){
        System.out.println("M1 method called"+ Thread.currentThread().getName());
     }
     public void run(){
        this.m1();
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