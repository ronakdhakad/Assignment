// 6. Write a Java program to get a shallow copy of a HashMap instance.
package assignment21.HashMap;
import java.util.HashMap;

public class Q6 {
    
    public static void main(String[] args) {
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        HashMap<String,String> copyColor = (HashMap<String,String>)(color.clone());
        System.out.println("Shallow copy of map: "+copyColor);
        color.put("6","red");
        System.out.println("After changes in orignal map: "+color);
        System.out.println("After changes - Shallow copy of map: "+copyColor);
        copyColor.put("7","green");
        System.out.println("After changes in copied map: "+color);
        System.out.println("After changes - Shallow copy of copied map: "+copyColor);
    }
}
