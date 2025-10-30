//10. Write a Java program to convert a priority queue to an array containing all its elements.
package assignment21.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;
//toArray();
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  PriorityQueue<String> queue =new  PriorityQueue<>();
        queue.offer("orange");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("white");
        queue.offer("green");
        System.out.println("Priority Queue:"+queue);
        String arr[]=new String[queue.size()];
        int i=0;
       for(String s:queue){
           arr[i]=s;
           i++;
       }
        System.out.print("Array: ");
       for(String s:arr){
           System.out.print(" "+s);
       }
        System.out.println("");
    }
}