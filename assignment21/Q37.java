// 15. Write a Java program that swaps two elements in a linked list.
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
public class Q37{
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
       Collections.swap(list,2,3);
       System.out.println("Swaped two elements: "+list);
    }
}
