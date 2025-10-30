//8. Write a Java program to retrieve the first element of the priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue:"+queue);
        System.out.println("Retrived element: "+queue.peek());
       
        System.out.println("After retrived an element:"+queue);
    }
}