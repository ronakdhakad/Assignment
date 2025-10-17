// 3. Write a Java program to iterate through all elements in a linked list 
// starting at the specified position.
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("List: "+list);

        System.out.println("Enter starting position: ");
        int n=sc.nextInt();

        ListIterator<String> itr=list.listIterator(n);
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
}
