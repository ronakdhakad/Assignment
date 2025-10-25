// 25. Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;
public class Q47{
    public static void main(String[] args) {

        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: "+list);
        System.out.println("Is list empty: "+list.isEmpty());
        // Collections.removeAll(list);
        list.removeAll(list);
        System.out.println("List: "+list);
        System.out.println("Is list empty: "+list.isEmpty());
    }
}
