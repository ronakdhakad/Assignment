// 22. Write a Java program to check if a particular element exists in a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q44 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> list =new LinkedList<>();
        list.add(669);
        list.add(246);
        list.add(884);
        list.add(455);
        list.add(678);
        
        System.out.print("Enter element: ");
        int a=sc.nextInt();

        if(list.contains(a)){
            System.out.println(a +" exists in list: "+list);
        }else{
            System.out.println(a +" not exists in the list: "+list);
        }
    }
}
