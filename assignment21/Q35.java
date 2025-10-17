//13. Write a Java program to remove the first and last elements from a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q35{
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
       list.remove(0);
       list.remove(list.size()-1);
       System.out.println("Remove first and last element: "+list);
    }
}
