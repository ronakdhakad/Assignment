// 26. Write a Java program to replace an element in a linked list.
import java.util.LinkedList;
public class Q48{
    public static void main(String[] args) {

        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: "+list);
        list.set(0,10);
        list.set(2,30);
        list.set(4,50);
        System.out.println("Replaced elements: "+list);
    }
}
