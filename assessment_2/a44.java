import java.util.Scanner;
class Code44{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //AP series  -21,-18,-15,-12....

        int a=-21;
        int difference= -18-(-21);

        //no of series
        System.out.println("enter nth term ");
        int n=sc.nextInt();

        //by using nth formula
        int n_th_term=a+(n-1)*difference;

        System.out.println(n+"th term of series : "+n_th_term);
    }
}

