//3. Write a Java program to add all the elements of a priority queue to another priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) {
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.print("Priority Queue1:"+queue);
System.out.println("");
        PriorityQueue<String> queue2=new PriorityQueue<>();
        queue2.offer("pink");
        queue2.offer("black");
        queue2.offer("green");
        System.out.println("queue2: "+queue2);
        queue2.addAll(queue);
        System.out.println("Add all elements of queue1 in queue2: "+queue2);
    }
}