// 2. Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class Q24 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
