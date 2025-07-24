import java.util.Scanner;
class Code38{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number (1 to 7)");
        int n =sc.nextInt();

            switch(n){
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    break;
                default :
                    System.out.println("Invalid input please enter number between (1 to 7)");
            }
    }
}
