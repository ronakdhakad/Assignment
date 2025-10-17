// 17. Write a Java program to join two linked lists.
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
public class Q39{
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
        list2.add("pranjal");
        list2.add("devraj");
        list2.add("sohan");
        list2.add("sneha");
        list2.add("khushi");
        list2.add("shaksham");
        
       System.out.println("List: "+list2);
    
    }
}
