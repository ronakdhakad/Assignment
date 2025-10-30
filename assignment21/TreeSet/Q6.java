//6. Write a Java program to clone a tree set list to another tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("white");
        set.add("pink");
        set.add("gray");
        set.add("orange");
        set.add("yellow");
        TreeSet <String> clone=(TreeSet<String>) set.clone();
        System.out.println("set: "+set);
        System.out.println("Clone TreeSet: "+clone);
        set.add("blue");
        System.out.println("After add a element in orignal Tree: "+set);
        System.out.println("After changes the set Clone TreeSet: "+clone);
        
//        System.out.println("Last element: "+set);
    }
}
