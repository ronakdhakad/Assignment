// 4. Write a Java program to iterate a linked list in reverse order.
import java.util.ListIterator;
import java.util.LinkedList;
public class Q26 {
    public static void main(String[] args) {

        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List:"+list);
        ListIterator<Integer> itr=list.listIterator();
        while(itr.hasNext()){
            itr.next();
        }
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println();
    }
}
