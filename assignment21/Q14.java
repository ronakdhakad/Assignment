// 14. Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("aaaa");
        arr1.add("bbbb");
        arr1.add("cccc");
        arr1.add("dddd");
        arr1.add("eeee");

        System.out.println("List: "+arr1);
        System.out.println();
        Collections.swap(arr1,1,2);
        System.out.println("Swaping between index 1 or 2 ");
        System.out.println("After swaping: "+arr1);
    }
}