
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        String str= "Hello user how are you ?";
System.out.println(str);
        
        String s[]=str.split(" ");
        List<String> list= Arrays.asList(s);

        Collections.reverse(list);

        for(String s1:s){
            System.out.print(s1+" ");
        }
    }
}
