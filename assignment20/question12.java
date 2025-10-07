//12. Write a program showing the concept of Thread Synchronization
class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }
}

class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread 1 
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try { 
                    Thread.sleep(100); 
                    }
                     catch (InterruptedException e) {}
            }
        }, "Thread-1");

        // Thread 2 
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try { 
                    Thread.sleep(100); 
                } 
                catch (InterruptedException e) {}
            }
        }, "Thread-2");

       
        t1.start();
        t2.start();
    }
}
