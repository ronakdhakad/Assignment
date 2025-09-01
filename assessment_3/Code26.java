import java.util.Scanner;
class Code26{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int n =sc.nextInt();
        //float m ==0);

            switch(n%2){
                case 0:
                    System.out.println("even");
                    break;
                case 1:
                    System.out.println("odd");
                    break;
                default :
                    System.out.println("Invalid");
            }
        


    }
    
}


