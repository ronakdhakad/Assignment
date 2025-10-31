//1. Write a Java program to associate the specified value with the specified key in a HashMap.
package assignment21.HashMap;
import java.util.HashMap;
public class Q1 {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");
        
        System.out.println("HashMap: "+map);
    }
}
