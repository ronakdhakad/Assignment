// 3. Write a Java program to copy all mappings from the specified map to another map.
package assignment21.HashMap;
import java.util.HashMap;
public class Q3 {
    public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        HashMap<String,String> color2 = new HashMap<>();
        color2.putAll(color);
        System.out.println("copied map: "+color2);
        color.put("6","green");
        System.out.println("After changing the orignal map: "+color);
        System.out.println("After changes the copied map: "+color2);
    }
}
