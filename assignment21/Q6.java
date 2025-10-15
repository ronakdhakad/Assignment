// 6. Write a Java program to remove the third element from an array list.
import java.util.ArrayList;
public class Q6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("orignal list- "+list);

        list.remove(2);
        System.out.println("Removed 3rd element- "+list);
    }
}

