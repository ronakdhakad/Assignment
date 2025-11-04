// 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
package assignment21.HashMap;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        System.out.println("map is empty or not: "+color.isEmpty());
    }
}
