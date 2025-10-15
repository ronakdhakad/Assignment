// 8. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;
public class Q8{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("kela");
        list.add("aanar");
        list.add("sevfal");
        list.add("aam");
        list.add("jamphal");
        System.out.println("List:- "+list);

        Collections.sort(list);
        System.out.println("sorted list:- "+list);
    }
    
}
