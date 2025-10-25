// 23. Write a Java program to convert a linked list to an array list.
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class Q45{
    public static void main(String[] args) {
        LinkedList <String> list =new LinkedList<>();
        list.add("infosys");
        list.add("yash");
        list.add("infobeans");
        list.add("wipro");
        list.add("systango");
        System.out.println("LinkedList: "+list);
        System.out.println("LinkedList convert to ArrayList");

        ArrayList<String> list2 =new ArrayList<>();
        Iterator itr =list.iterator();
        int i=0;
        while(itr.hasNext()){
            list2.add(list.get(i));
            itr.next();
            i++;
        }
        
        System.out.println("ArrayList: "+list2);
    }
}
