import java.util.Scanner;
class Code13{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter area :");
        int area = sc.nextInt();

        System.out.println("enter leg1 :");
        int leg1 = sc.nextInt();

        //to find leg2 with triangle formula
        int leg2 =((area*2)/leg1);

        System.out.println("leg2 is: "+leg2+"cm");
    }
}
