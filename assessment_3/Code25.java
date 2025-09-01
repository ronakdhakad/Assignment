import java.util.Scanner;
class Code25{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number (1 to 5)");
        int n =sc.nextInt();

        //for(int n=1;n<=5;n++){
            switch(n){
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                default :
                    System.out.println("Invalid");
            }
        //}


    }
    
}
