// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;
public class Q4{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("RAM");
        list.add("SHYAM");
        list.add("MOHAN");
        list.add("LAXMAN");
        list.add("MAKHAN");
        System.out.println(list.get(1));
        System.out.println(list.get(4));
    }
}
