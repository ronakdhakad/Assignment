import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter celsius: ");
        int c=sc.nextInt();

        float fahrenheit=((c*(9/5f))+32);
        System.out.print(c+" C = "+fahrenheit+" F");
    }
}

