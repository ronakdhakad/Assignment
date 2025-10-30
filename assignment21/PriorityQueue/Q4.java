//4. Write a Java program to insert a given element into a priority queue.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue:"+queue);
        System.out.println("Enter an element: ");
        String s=sc.nextLine();
System.out.println("");
           queue.add(s);
System.out.println("Element added in queue: "+queue);
    }
}