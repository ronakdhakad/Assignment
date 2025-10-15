// 3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        System.out.println("Orignal list");
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0,4);
        list.add(0,5);
        System.out.println("add data  at 0th index ");
        System.out.println(list);

    }
}
