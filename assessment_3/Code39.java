import java.util.Scanner;
class Code39{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter amount");
        int a=sc.nextInt();

        System.out.println("enter a note vale like(100,200.500)");
        int v=sc.nextInt();
        int total_note=a/v;
        System.out.println("total number of notes is "+total_note);



    }
    
}
