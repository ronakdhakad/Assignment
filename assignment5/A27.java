import java.util.Scanner;
class A27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print("* ");
            }else{
                System.out.print("# ");
            }
        }
    }
}


