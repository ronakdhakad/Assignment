// 12. Write a Java program to get a collection view of the values contained in this map.
package assignment21.HashMap;
import java.util.HashMap;
import java.util.Collection;

public class Q12 {
     public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        Collection<String> c =color.values();
        System.out.println("orignal map: "+color);
        System.out.println("collection view of values: "+c);
     }
}
