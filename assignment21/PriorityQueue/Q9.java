//9. Write a Java program to retrieve and remove the first element.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue:"+queue);
        System.out.println("Retrived element: "+queue.poll());
       
        System.out.println("After retrived an element:"+queue);
    }
}