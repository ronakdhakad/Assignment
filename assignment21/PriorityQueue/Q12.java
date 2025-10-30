//12. Write a Java program to change priorityQueue to maximum priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Collections;
//toArray();
public class Q12 {
    public static void main(String[] args) {
  PriorityQueue<Integer> queue =new  PriorityQueue<>(Collections.reverseOrder());
        queue.offer(2);
        queue.offer(65);
        queue.offer(78);
        queue.offer(5);
        queue.offer(0);
        queue.offer(89);
        System.out.println("Priority Queue:"+queue);
        queue.poll();
        System.out.println("Maximum priority queue: "+queue.poll());
        
    }
}