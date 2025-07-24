import java.util.Scanner;
class Code44{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a operator (+,>,==)");
        char n =sc.next().charAt(0);

        System.out.println("enter number first ");
        int a1=sc.nextInt();

        System.out.println("enter number second");
        int a2=sc.nextInt();

            switch(n){
                case '+':
                    System.out.println((a1+a2)+" is addition of both");
                    break;
                case '>':
                    int max=(a1>a2)?a1:a2;
                    System.out.println(max+" is greater");
                    break;
                case '=':
                    if((a1-a2)==0){
                        System.out.println("number1 and number2 is equal");
                    }else{
                        System.out.println("number1 and number2 is not equal");
                    }
                    break;
                default :
                    System.out.println("Invalid operator");
            }

    }
    
}


