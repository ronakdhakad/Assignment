import java.util.Scanner;
class b{
    public static void main(String arg []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        int i=1;
        while(n!=0){
            System.out.print(i+"\t");
            i++;
            n--;
        }
    }
    
}
