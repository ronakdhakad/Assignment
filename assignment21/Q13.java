// 13. Write a Java program to compare two array lists.
import java.util.ArrayList;
import java.util.Collections;
public class Q13 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("List1: "+list);

        ArrayList<String> list1=new ArrayList<>();
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("f");
        list1.add("g");

        System.out.println("List2: "+list1);
        
        if(list.equals(list1)){
            System.out.println("Both lists are same.");
        }

        ArrayList<String> comman=new ArrayList<>(list);
            comman.retainAll(list1);
        System.out.println("Comman Elements: "+comman);


        ArrayList<String> l1=new ArrayList<>(list);
        l1.removeAll(list1);
        System.out.println("Only list1 elements: "+l1);

        ArrayList<String> l2=new ArrayList<>(list1);
        l2.removeAll(list);
        System.out.println("Only list2 elements: "+l2);

    }
}
