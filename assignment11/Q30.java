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

        if(p>=500){
            double amt=(double)(p*(Math.pow((1+(r/100f)),t)));
            double CI=amt-p;
            System.out.println("Compound Intrest is: "+CI);
        }else{
            double SI=(double)(p*r*t)/100;
            System.out.println("Simple Intrest is: "+SI);
        }

    }
}