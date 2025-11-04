// 2. Write a Java program to count the number of key-value (size) mappings in a map.
package assignment21.HashMap;
import java.util.HashMap;
public class Q2{
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("1",10);
        hm.put("2",20);
        hm.put("3",30);
        hm.put("4",40);
        hm.put("5",50);
        System.out.println("Size of key-value: "+hm.size());
        
   }
}
