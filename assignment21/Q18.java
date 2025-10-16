// 18. Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;
import java.util.Iterator;

public class Q18<E> {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("List: "+list);
        ArrayList<Integer> list1=new ArrayList<>();

        if(list.size()==0){
            System.out.println(list+": is an empty list..");
        }else{
            System.out.println(list+": is not an empty list..");
        }

        if(list1.size()==0){
            System.out.println(list1+": is an empty list..");
        }else{
            System.out.println(list1+": is not an empty list..");
        }

        if (list1.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        list1.add(66);

        if (list1.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
