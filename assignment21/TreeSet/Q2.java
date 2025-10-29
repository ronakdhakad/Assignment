//2. Write a Java program to iterate through all elements in a tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("blue");
        set.add("pink");
        set.add("gray");
        set.add("orange");
        set.add("yellow");
        Iterator itr =set.iterator();
        System.out.println("TreeSet using Iterator:  " );
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        
    }
}
