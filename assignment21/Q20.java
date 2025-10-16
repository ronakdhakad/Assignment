// 20. Write a Java program to increase an array list size.

import java.util.ArrayList;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("List: "+list);

        list.ensureCapacity(100);

        list.add(66);
        list.add(77);
        list.add(88);

        System.out.println("Ensure ArrayList: "+list);
    }
}
