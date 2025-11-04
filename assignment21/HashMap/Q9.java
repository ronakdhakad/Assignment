// 9. Write a Java program to create a set view of the mappings contained in a map.
package assignment21.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q9 {
        public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        System.out.println("keys: "+color.keySet());
        System.out.println("values: "+color.values());
            Set<Map.Entry<String,String>> m=color.entrySet();
            System.out.println("Entry set: "+m);
        }
}
