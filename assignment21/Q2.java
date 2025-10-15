// 2. Write a Java program to iterate through all elements in an array list.
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
// import java.util.ListIterator;

public class Q2 {
       public static void main(String[] args) {
        List list=new ArrayList();
        list.add("RED");
        list.add("WHITE");
        list.add("BLUE");
        list.add("GREEN");
        list.add("BLACK");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
       }
}
