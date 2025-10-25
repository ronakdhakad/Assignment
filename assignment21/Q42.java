// 20. Write a Java program to retrieve, but not remove, the first element of a linked list.
import java.util.LinkedList;

public class Q42 {
    public static void main(String[] args) {
        LinkedList <String> list =new LinkedList<>();
        list.add("cat");
        list.add("monkey");
        list.add("elephant");
        list.add("cow");
        list.add("horse");
        System.out.println("List: "+list);
        String rf=list.getFirst();
        System.out.println("First element: "+rf);
        System.out.println("After retrive first element: "+list);
System.out.println();
    }
}