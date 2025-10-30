//7. Write a Java program to compare two priority queues.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue1:"+queue);
        
       
System.out.println("");
  PriorityQueue<String> queue2 =new  PriorityQueue<>();
        queue2.offer("black");
        queue2.offer("red");
        queue2.offer("gray");
        queue2.offer("golden color");
        queue2.offer("wooden color");
        System.out.println("Priority Queue:"+queue);
           System.out.println("Compare two queue: "+queue.containsAll(queue2));
System.out.println("Compare the queue by equals method: "+queue.equals(queue2));
    }
}