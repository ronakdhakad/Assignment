// 9. Write a Java program to copy one array list into another.
import java.util.ArrayList;
public class Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List-1: "+list);

        ArrayList<Integer> list1=new ArrayList<>();
        for(Integer a:list){
            list1.add(a);
        }

        System.out.println("Copy of List-1");
        System.out.println("List-2: "+list1);

        
    }
}
