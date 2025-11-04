// 4. Write a Java program to remove all mappings from a map.
package assignment21.HashMap;

import java.util.HashMap;

public class Q4{
        public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        System.out.println("After Remove all from map: "+color.remove(color));
        color.clear();
        System.out.println("cleared map: "+color);
        
        }
}
