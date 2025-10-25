// 18. Write a Java program to copy a linked list to another linked list.
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
public class Q40{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        list.add("atul");
        list.add("ronak");
        list.add("sohan");
        list.add("meherban");
        list.add("nishant");
        list.add("shaksham");
        
       System.out.println("List: "+list);

       LinkedList<String> list2=new LinkedList<>(list);
        
       System.out.println("Copy List: "+list2);

       LinkedList <String> list3=new LinkedList<>();
       list3.addAll(list);
       System.out.println("copied list2: "+list3);
    }
}
