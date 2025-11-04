// 10. Write a Java program to get the value of a specified key in a map.
package assignment21.HashMap;
import java.util.Scanner;
import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<String,String> color = new HashMap<>();
        color.put("1","white");
        color.put("2","blue");
        color.put("3","yellow");
        color.put("4","orange");
        color.put("5","black");
        System.out.println("orignal map: "+color);
        System.out.println("Enter key to get the value: ");
        String s=sc.nextLine();
        System.out.println("value: "+color.get(s));
        System.out.println(color.containsValue("black"));
        
    }
}
