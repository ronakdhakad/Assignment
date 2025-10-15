// 12. Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.List;
public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("apple");
        fruit.add("tomato");
        fruit.add("cherry");
        fruit.add("mango");
        fruit.add("banana");
        System.out.println("List: "+fruit);
        List<String> sublist=fruit.subList(1,3);
        System.out.println("portion or sublist: "+sublist);
    }
}
