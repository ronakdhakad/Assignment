// 19. Write a Java program to remove and return the first element of a linked list.


import java.util.LinkedList;

public class Q41 {
    public static void main(String[] args) {
        LinkedList <String> list =new LinkedList<>();
        list.add("cat");
        list.add("monkey");
        list.add("elephant");
        list.add("cow");
        list.add("horse");
        System.out.println("List: "+list);
        System.out.println("First element: "+list.get(0));
        list.remove(0);
        System.out.println("Removed first element: "+list);
System.out.println();
        LinkedList <String> list2 =new LinkedList<>(list);

        System.out.println("List2: "+list2);
        String removedElement =list2.removeFirst();
        System.out.println("First element: "+removedElement);
        System.out.println("Removed first element: "+list2);
    }    
}
