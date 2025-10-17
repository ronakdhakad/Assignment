// 16. Write a Java program to shuffle elements in a linked list.
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
public class Q38{
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
       Collections.shuffle(list);
       System.out.println("Shuffle elements: "+list);
    }
}
