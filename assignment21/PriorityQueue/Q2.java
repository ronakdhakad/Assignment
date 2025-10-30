//2. Write a Java program to iterate through all elements in the priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.print("Priority Queue:");
        Iterator itr =queue.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println("");
    }
}