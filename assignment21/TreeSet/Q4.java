//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Q4 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("white");
        set.add("pink");
        set.add("gray");
        set.add("");
        set.add("yellow");
        System.out.println("set: "+set);
        Iterator itr =set.iterator();
        while(itr.hasNext()){
            itr.next();
        }
        while(itr.hasNext()){
            itr.();
        }
        
        System.out.println("Reverse set: "+set);
    }
}
