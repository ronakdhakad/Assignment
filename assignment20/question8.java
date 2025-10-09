/*
8. Create a Thread class to print following star(*) pattern on screen with delay of 1

second between each * print. Number of lines in the pattern should be passed

to the constructor of Thread class.

* * * * *

* * * *

* * *

* *

*

Use this class in main method and ask user to enter number of lines to print.

 */
import java.util.Scanner;

class PatternThread extends Thread {
    
    int n; 
    PatternThread(int n) {
        this.n=n;
    }

    @Override
    public void run() {
        try {
            for (int i = n; i >= 1; i--) {       
                for (int j = 1; j <= i; j++) {       
                    System.out.print("* ");
                    Thread.sleep(1000);             
                }
                System.out.println();                
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        PatternThread spThread = new PatternThread(n);
        spThread.start();  
    }
}
