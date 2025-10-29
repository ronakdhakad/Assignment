//10. Write a Java program to compare two hash set.
package assignment21;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Q58 {
    public static void main(String[] args) {
        
        HashSet<Integer> set =new HashSet<>();
        System.out.println("Enter data into HashSet: ");
        set.add(32);
        set.add(-5);
        set.add(9);
        set.add(4);
        set.add(8);
        set.add(566);
        
        HashSet<Integer> set2=new HashSet<>();
        set2.add(32);
        set2.add(-6);
        set2.add(19);
        set2.add(-4);
        set2.add(2);
        set2.add(566);
        HashSet<Integer> compare=new HashSet<>();
        for(Integer n:set){
            if(set2.contains(set)){
                compare.add(n);
            }
        }
         System.out.println("HashSet set1: "+set);
         System.out.println("HashSet set2: "+set2);
         System.out.println("Compare two hashset: "+set.equals(set2));
         System.out.println("comapre by for each: "+compare);
        

      
        }
    }
