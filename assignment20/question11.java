// Write a program showing the concept of Deadlock

class Computer {}
class Mouse {}

class Main{
    public static void main(String args[]) {
        Computer s = new Computer();
        Mouse m = new Mouse();

        // Thread 1
        new Thread() {
            @Override
            public void run() {
                synchronized (m) {
                    System.out.println("Thread 1 uses Mouse and needs System");
                    try { 
                        Thread.sleep(1000); 
                    }catch (InterruptedException e) {
                         System.out.println("Exception: " + e);
                    }
                    synchronized (s) {
                        System.out.println("Thread 1 uses System");
                    }
                }
            }
        }.start();

        // Thread 2
        new Thread() {
            @Override
            public void run() {
                synchronized (s) {
                    System.out.println("Thread 2 uses System and needs Mouse");
                    try { 
                        Thread.sleep(1000); } 
                        catch (InterruptedException e) { 
                            System.out.println("Exception: " + e); }
                    synchronized (m) {
                        System.out.println("Thread 2 uses Mouse");
                    }
                }
            }
        }.start();
    }
}
