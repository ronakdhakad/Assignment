// 11. Write a Java program to display elements and their positions in a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q33{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        list.add("atul");
        list.add("ronak");
        list.add("sohan");
        list.add("meherban");
        list.add("nishant");
        list.add("shaksham");
        
        for(int i=0;i<list.size();i++){
            System.out.print("Element: "+list.get(i));
            System.out.print(" Position: "+i);
            System.out.println();

        }
    }
}
