// 14. Write a Java program to remove all elements from a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q36{
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
       list.removeAll(list);
       System.out.println("Remove all elements: "+list);
    }
}
