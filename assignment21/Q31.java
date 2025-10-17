// 9. Write a Java program to insert some elements at the specified position into a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q31{
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
        System.out.println("Enter elements : ");
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        String n3=sc.nextLine();
        String n4=sc.nextLine();
System.out.println();
        list.add(1,n1);
        list.add(3,n2);
        list.add(5,n3);
        list.add(6,n4);

        System.out.println("Adding elements: "+list);
        System.out.println();
    }
}
