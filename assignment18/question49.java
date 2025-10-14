/*49. Input data exactly in the following format, and print sum of all integer values.
“67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)
*/
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a numbers with spaces");
        String str=inp.nextLine();
        String strS[]=(str.split(" "));
        for(String s:strS){
            sum+=Integer.parseInt(s);
        }import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a numbers with spaces");
        String str=inp.nextLine();
        String strS[]=(str.split(" "));
        for(String s:strS){
            sum+=Integer.parseInt(s);
        }
        System.out.println("Sum of numbers in array "+sum);
    }
}
        System.out.println("Sum of numbers in array "+sum);
    }
}