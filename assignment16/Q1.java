import java.util.Scanner;
class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0;i<args.length;i++){
            int num = Integer.parseInt(args[i]);
            int last= num%10;
            int first = num;
            while(first >= 10){
              first = first/10;
            }
             sum = first + last;
        }
        System.out.print("THE SUM IS : " + sum);
    }
}