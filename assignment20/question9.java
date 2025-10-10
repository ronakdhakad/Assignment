import java.util.Scanner;

class Prime implements Runnable {
    int num;

    Prime(int num) {
        this.num = num;
    }

    public void run() {
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) { 
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Prime p = new Prime(num);
        Thread t = new Thread(p);
        t.start();
    }
}
