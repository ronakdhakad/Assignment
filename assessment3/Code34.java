import java.util.Scanner;
class Code34 {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter three sides of triangle");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();

        if(s1==s2&&s2==s3&&s3==s1){
            System.out.println("all sides are equal. it is equilateral triangle");
        }else if(s1==s2||s2==s3||s3==s1){
            System.out.println("two sides are equal. it is isosceles triangle");
        }else{
            System.out.println("all sides are unequal. it is scalene triangle");
        }
    }


    
}
