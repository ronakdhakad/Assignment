// 19. Write a Java program for trimming the capacity of an array list.

import java.util.ArrayList;

public class Q19 {
        public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("List: "+list);

        list.trimToSize();
        System.out.println("Trimed list: "+list);
    
    }
}
