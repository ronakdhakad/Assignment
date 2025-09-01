//…... -6	-3	0	3	6	9	……. n terms
import java.util.Scanner;	
class A16 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n terms");
        int n= sc.nextInt();
        for(int i=-n;i<=n;i++){
            int num=i*3;
            System.out.print(num+" ");
        }
    }
    
}
