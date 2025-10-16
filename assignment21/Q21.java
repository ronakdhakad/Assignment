// 21. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.ArrayList;

public class Q21 {
        public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("mango");
        list.add("banana");
        list.add("apple");
        System.out.println("List: "+list);

        list.set(1,"orange");
        System.out.println("Repalce 2nd element: "+list);
        }
}
