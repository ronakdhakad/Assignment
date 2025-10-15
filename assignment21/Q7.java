// 7. Write a Java program to search for an element in an array list.

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("List:- "+list);

        if(list.contains(3))
            System.out.println("Element found ");
        else
            System.out.println("Element not found ");

        System.out.println("Index of Element ");
        System.out.println(list.indexOf(3));
    }
}
