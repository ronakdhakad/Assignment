// 11. Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Q11 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: "+list);
        Collections.reverse(list);
        System.out.println("Reverse List: "+list);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("List1: "+list1);

        ArrayList<Integer> list2=new ArrayList<>();
        
        for(int i=list1.size()-1;i>=0;i--){
            list2.add(list1.get(i));
        }

        System.out.println("Reverse List: "+list2);
    }
}
