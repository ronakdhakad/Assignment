//5. Write a Java program to remove all elements from a priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue:"+queue);
       
System.out.println("");
           queue.removeAll(queue);
System.out.println("Removed all elements: "+queue);
    }
}