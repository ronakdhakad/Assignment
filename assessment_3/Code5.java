//5.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
class Code5{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter age of first person");
        int age1=sc.nextInt();

        System.out.println("enter age of second person");
        int age2=sc.nextInt();

        System.out.println("enter age of third person");
        int age3=sc.nextInt();

        if(age1>age2&&age1>age3){
            System.out.println("first is oldest");
        }else if(age2>age1&&age2>age3){
            System.out.println("second is oldest");
        }else{
            System.out.println("third is oldest");
        }

        if(age1<age2&&age1<age3){
            System.out.println("first is youngest");
        }else if(age2<age1&&age2<age3){
            System.out.println("second is youngest");
        }else{
            System.out.println("third is youngest");
        }

    }
    
}
