import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter fahrenheit: ");
        int f=sc.nextInt();

        float celsius=(f-32)*(5f/9);
        System.out.print(f+" F = "+celsius+" C");
    }
}

