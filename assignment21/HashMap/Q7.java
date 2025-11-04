// 7. Write a Java program to test if a map contains a mapping for the specified key.
package assignment21.HashMap;
import java.util.HashMap;

public class Q7 {
    public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        System.out.println(color.keySet());
        System.out.println(color.values());
        if(color.containsKey("2")){
            System.out.println("key is present");
        }
        else{
            System.out.println("key is not present");
        }
    }
}
