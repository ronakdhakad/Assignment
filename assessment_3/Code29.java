import java.util.Scanner;
class Code29 {
    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter number1");
        int n1=sc.nextInt();

        System.out.println("enter number2");
        int n2=sc.nextInt();

        System.out.println("enter number3");
        int n3=sc.nextInt();

        System.out.println("enter number4");
        int n4=sc.nextInt();

        int min = (n1<n2 && n1<n3&&n1<n4) ? n1:(n2<n1 && n2<n3&&n2<n4) ? n2:(n3<n1&&n3<n2&&n3<n4)?n3:n4;
        System.out.println("lowest number is "+min);

    }
    
}
