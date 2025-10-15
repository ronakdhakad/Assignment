// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.ArrayList;
import java.util.List;
public class Q1{
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("RED");
        list.add("WHITE");
        list.add("BLUE");
        list.add("GREEN");
        list.add("BLACK");

        System.out.println(list);
    }
}
