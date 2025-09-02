import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();

        int sum=1;
        if(a>b){
            for(int i=2;i<=a;){
                if(a%i==0&&b%i==0){
                    sum=sum*i;
                    a=a/i;
                    b=b/i;
                }else if(a%i==0){
                    sum=sum*i;
                    a=a/i;
                }else if(b%i==0){
                    sum=sum*i;
                    b=b/i;
                }
                else{
                    i++;
                }
            }
            System.out.println(sum);
        }else{
            for(int i=2;a!=1&&b!=1;){
                if(a%i==0){
                    sum=sum*i;
                    a=a/i;
                }else if(b%i==0){
                    sum=sum*i;
                    b=b/i;
                }
                else{
                    i++;
                }
            }
            System.out.println(sum);
        }
    }
    
}
