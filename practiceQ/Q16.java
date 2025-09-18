import java.util.Scanner;
class Runtimeerror{
    int a,b;
    Runtimeerror(int a1,int b1){
        a=a1;
        b=b1;
    }
    void error() throws Exception{
        // try{
            int c=a/b;
            System.out.println("Ans: "+c);
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Exception Handling Executed ....1");
        // }
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of 'A'");
        int a=sc.nextInt();
        System.out.println("Enter Value of 'B'");
        int b=sc.nextInt();

        Runtimeerror o=new Runtimeerror(a,b);
        try{
            o.error();
        }catch(Exception e){
            System.out.println(e);
            // e.printStackTrace
             e.getMessage();
        }
        finally{
            System.out.println("Exception Handling Executed ....2");
        }
    }
    
}
