import java.util.Scanner;
    class A10{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int i=0;
            int even;
          
            while(i<=n){
                if(i%2==0){
                    even=i;
                    System.out.println(even+" ");
                }else{
                    System.out.print("");
                }
                i++;
            }
        }    
    }
