//WAP to find out the factors of a number.
import java.util.Scanner;
    class A6 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int i=1;
            int count=0;
          
            while(i<=n){
                if(n%i==0){
                    count++;
                }else{
                    System.out.print("");
                }
                i++;
            }
            System.out.println("factors of "+n+" is "+count);
            
        }
    
}
