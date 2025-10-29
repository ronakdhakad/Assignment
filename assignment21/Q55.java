//7. Write a Java program to convert a hash set to an array.
package assignment21;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
public class Q55 {
    public static void main(String[] args) {
        
        HashSet<String> set =new HashSet<>();
        System.out.println("Enter data into HashSet: ");
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        
        System.out.println("HashSet: "+set);
        String arr[]=set.toArray(new String[0]);

//            for(int i=0;i<set.size();i++){
//                System.out.print(arr[i]);
//        }
        for(String s:arr){
                System.out.println(s);
        }
    }
}