// 11. Write a Java program to get a set view of the keys contained in this map.
package assignment21.HashMap;

import java.util.HashMap;
import java.util.Set;
public class Q11 {
    public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        Set<String> key =color.keySet();
        System.out.println("orignal map: "+color);
                System.out.println("key set: "+key);
    }
}
