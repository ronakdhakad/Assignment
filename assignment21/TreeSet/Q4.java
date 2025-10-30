//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;


public class Q4 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("white");
        set.add("pink");
        set.add("gray");
        set.add("red");
        set.add("yellow");
        System.out.println("set: "+set);
        Iterator itr =set.descendingIterator();
                System.out.print("Reverse set: ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        System.out.println("orignal set: "+set);
        
       NavigableSet<String> nav=set.descendingSet();
        System.out.println("By NavigableSet reverse order: "+nav);
    }
}
