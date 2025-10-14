// 12) Java Program to Sort Names in an Alphabetical Order
// Solve the following topics programs by function
// 1) Control Statement Programs
// 2) Loops Programs
// 3) Series Programs
// 4) Patterns Programs
// 5) Array Programs
import java.util.Arrays;
class Q12{
    public static void main(String[] args) {
        String names[] = args; 
        Arrays.sort(names);
        System.out.println("Sorted Names:");
        for (String name : names)
            System.out.println(name);
    }
}
