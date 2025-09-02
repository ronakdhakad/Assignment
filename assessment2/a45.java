import java.util.Scanner;
class Code45{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //AP series  -21,-18,-15,-12....
        int a=-21;
        int difference= -18-(-21);

        System.out.println("enter nth term ");
        int n=sc.nextInt();

        //by using Sn_th formula
        float sum_of_n_number=(float)((n/2f)*(2*a+(n-1)*difference));

        System.out.println("sum of "+n+"th term : "+sum_of_n_number);
    }
}

