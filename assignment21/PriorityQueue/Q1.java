//1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
public class Q1 {
    public static void main(String[] args) {
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue: "+queue);
    }
}