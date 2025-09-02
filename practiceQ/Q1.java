import java.util.Scanner;
 class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter principle :");
        int principle=sc.nextInt();

        System.out.println("Enter rate :");
        double rate=sc.nextInt();

        System.out.println("Enter time :");
        int time=sc.nextInt();

        double Amt=(double)(principle*Math.pow(1+(rate/100),time));

        double compoundIntrest=(Amt-principle);
        
        System.out.println("Amount :"+Amt);
        System.out.println("Compound Intrest :"+compoundIntrest);
    }
 }