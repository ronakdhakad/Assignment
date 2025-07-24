import java.util.Scanner;
class Code20{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter variable1");
        int var1=sc.nextInt();

        System.out.println("enter variable2");
        int var2=sc.nextInt();

        var1=var1^var2;
        var2=var1^var2;
        var1=var1^var2;

        System.out.println("var1 is "+var1);
        System.out.println("var2 is "+var2);



    }
    
}
