// 10. Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
        public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List-1: "+list);
            Collections.shuffle(list);
        System.out.println("Shuffled list: "+list);
    }
}
