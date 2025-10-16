// 22. Write a Java program to print all the elements of an ArrayList using the elements' position.

import java.util.ArrayList;

public class Q22 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
