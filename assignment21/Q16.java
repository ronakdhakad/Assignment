// 16. Write a Java program to clone an array list to another array list.
import java.util.ArrayList;
public class Q16 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("List: "+list);
        ArrayList<Integer> list1=new ArrayList<>(list);
        System.out.println(list1);
        System.out.println(list1.clone());
        System.out.println("Copy list: "+list1);

    }
}
