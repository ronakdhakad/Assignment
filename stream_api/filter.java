import java.util.*;
import java.util.stream.Stream;
class StreamApi{
    public static void main(String args[]){

        List<Integer> num =Arrays.asList(12,234,66,87,100);
        
        Stream<Integer> s=num.stream();

        System.out.println(s.forEach());

    }
}