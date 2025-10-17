// 1. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class Q23 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Orignal List: "+list);
        list.addLast(5);

        System.out.println("Appended List: "+list);
    }
}
