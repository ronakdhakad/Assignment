import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter principle: ");
        int p=sc.nextInt();
        System.out.print("Enter rate: ");
        int r=sc.nextInt();
        System.out.print("Enter time: ");
        int t=sc.nextInt();

        double amt=p*(Math.pow(1+(r/100f),t));
        System.out.println("Amount after "+t+" year "+amt);
        double CI=amt-p;
        System.out.print("Compound Interest is: "+CI);
    }
}