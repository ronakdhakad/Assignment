// 5. Write a Java program to insert the specified element at the specified position in the linked list
import java.util.LinkedList;
import java.util.Scanner;
public class Q27 {
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
        System.out.println("Enter position of element: ");
        int n=sc.nextInt();
System.out.println();
        list.remove(n);
        System.out.println("Remove element from "+n+" positin: "+list);
        System.out.println();
    }
}
