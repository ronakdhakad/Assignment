//11. Write a Java program to convert a Priority Queue element to string representations.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;
//toArray();
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue:"+queue);
        
        System.out.println("String representation: "+queue.toString());
    }
}