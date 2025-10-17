// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q32{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        list.add("atul");
        list.add("ronak");
        list.add("sohan");
        list.add("meherban");
        list.add("nishant");
        list.add("shaksham");
        
        System.out.println("Orignal List: "+list);
        System.out.println();
System.out.println("first element: "+list.get(0));
        System.out.println("last element: "+list.get(list.size()-1));
    }
}
