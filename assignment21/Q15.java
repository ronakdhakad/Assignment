// 15. Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.Collections;
public class Q15 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("List1: "+list1);

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(0);
        System.out.println("List1: "+list2);
        
        System.out.println("Combined list:- ");
        for(Integer a:list2){
            System.out.println(list1.add(a));
        }

    } 
}
