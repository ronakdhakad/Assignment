//12. Write a Java program to remove a specified element from a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q34{
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
       list.remove(2);
       System.out.println("Remove element: "+list);
    }
}
