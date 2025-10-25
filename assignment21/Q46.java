// 24. Write a Java program to compare two linked lists.
import java.util.LinkedList;
public class Q46{
    public static void main(String[] args) {

        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List1: "+list);
        
        LinkedList<Integer> list2 =new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List2: "+list2);
System.out.println("Compare two LinkedList");
        System.out.println("list1 is equals to list2: "+list.equals(list2));

        if(list.size()==list2.size())
            System.out.println("list1 or list2 are equal in size.");
        else
            System.out.println("list1 or list2 are not equal in size.");
    }
}