// 21. Write a Java program to retrieve, but not remove, the last element of a linked list.
import java.util.LinkedList;

public class Q43{
    public static void main(String[] args) {
        LinkedList <String> list =new LinkedList<>();
        list.add("cat");
        list.add("monkey");
        list.add("elephant");
        list.add("cow");
        list.add("horse");
        System.out.println("List: "+list);
        String rf=list.getLast();
        System.out.println("Last element: "+rf);
        System.out.println("After retrive last element: "+list);
System.out.println();
    }
}
