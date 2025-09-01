//WAP to print N even numbers.
import java.util.Scanner;
    class A9{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int i=0;
            int even;
          
            while(i<2*n){
                if(i%2==0){
                    even=i;
                    System.out.print(even+" ");
                }else{
                    System.out.print("");
                }
                i++;
            }
        }    
    }
