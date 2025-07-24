import java.util.Scanner;
class Code41 {
    public static void main(String arg[]){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter your physics marks(in out of 100)");
    double physics=sc.nextDouble();
    
    System.out.println("enter your chemistry marks(in out of 100)");
    double chemistry=sc.nextDouble();
    
    System.out.println("enter your maths marks(in out of 100)");
    double maths=sc.nextDouble();
    
    System.out.println("enter your bio marks(in out of 100)");
    double bio=sc.nextDouble();
    
    System.out.println("enter your computer marks(in out of 100)");
    double computer=sc.nextDouble();

    double marks=(double)((physics+chemistry+maths+bio+computer)/5);

    if(marks>=90){
        System.out.println(marks+"% your grade is 'A'");
    }else if(marks>=80){
        System.out.println(marks+"% your grade is 'B'");
    }else if(marks>=70){
        System.out.println(marks+"% your grade is 'C'");
    }else if(marks>=60){
        System.out.println(marks+"% your grade is 'D'");    
    }else if(marks>=40){
        System.out.println(marks+"% your grade is 'E'");
    }else{
        System.out.println(marks+"% your grade is 'F'");

    }

    }
}
