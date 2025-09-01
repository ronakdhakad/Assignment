import java.util.Scanner;
    class A12{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int i=0;
            int odd;
          
            while(i<=n){
                if(i%2!=0){
                    odd=i;
                    System.out.println(odd+" ");
                }else{
                    System.out.print("");
                }
                i++;
            }
        }    
    }

