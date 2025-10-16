// 17. Write a Java program to empty an array list.

import java.util.ArrayList;

public class Q17 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("List: "+list);
        list.clear();
        System.out.println("An empty list: "+list);
    }
}
